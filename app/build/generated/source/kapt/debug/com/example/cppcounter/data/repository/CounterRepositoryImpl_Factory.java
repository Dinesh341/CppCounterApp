package com.example.cppcounter.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class CounterRepositoryImpl_Factory implements Factory<CounterRepositoryImpl> {
  @Override
  public CounterRepositoryImpl get() {
    return newInstance();
  }

  public static CounterRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CounterRepositoryImpl newInstance() {
    return new CounterRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final CounterRepositoryImpl_Factory INSTANCE = new CounterRepositoryImpl_Factory();
  }
}
