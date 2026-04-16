package com.example.nativelib

object NativeBridge {

    init {
        System.loadLibrary("native-lib")
    }

    private var listener: ((Int) -> Unit)? = null

    external fun incrementCount()

    fun setListener(callback: ((Int) -> Unit)?) {
        this.listener = callback
    }

    @JvmStatic
    fun onCountUpdated(count: Int) {
        listener?.invoke(count)
    }
}