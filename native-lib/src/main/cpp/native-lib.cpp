#include <jni.h>
#include <thread>
#include <chrono>

static int counter = 0;

JavaVM* gJvm = nullptr;
jclass gClass = nullptr;

extern "C"
JNIEXPORT void JNICALL
Java_com_example_nativelib_NativeBridge_incrementCount(
        JNIEnv* env,
        jobject thiz) {

    counter++;
    int currentCount = counter;

    if (gClass == nullptr) {
        jclass localClass =
                env->FindClass("com/example/nativelib/NativeBridge");

        gClass = (jclass) env->NewGlobalRef(localClass);
    }

    std::thread([currentCount]() {

        std::this_thread::sleep_for(std::chrono::seconds(2));

        JNIEnv* env;
        gJvm->AttachCurrentThread(&env, nullptr);

        jmethodID method =
                env->GetStaticMethodID(
                        gClass,
                        "onCountUpdated",
                        "(I)V"
                );

        env->CallStaticVoidMethod(gClass, method, currentCount);

        gJvm->DetachCurrentThread();

    }).detach();
}

JNIEXPORT jint JNICALL
JNI_OnLoad(JavaVM* vm, void*) {

    gJvm = vm;
    return JNI_VERSION_1_6;
}