package com.example.cppcounter.di;

import com.example.cppcounter.domain.repository.CounterRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class RepositoryModule_ProvideRepositoryFactory implements Factory<CounterRepository> {
  @Override
  public CounterRepository get() {
    return provideRepository();
  }

  public static RepositoryModule_ProvideRepositoryFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CounterRepository provideRepository() {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideRepository());
  }

  private static final class InstanceHolder {
    private static final RepositoryModule_ProvideRepositoryFactory INSTANCE = new RepositoryModule_ProvideRepositoryFactory();
  }
}
