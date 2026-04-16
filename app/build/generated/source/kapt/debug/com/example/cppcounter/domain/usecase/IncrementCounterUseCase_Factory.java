package com.example.cppcounter.domain.usecase;

import com.example.cppcounter.domain.repository.CounterRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class IncrementCounterUseCase_Factory implements Factory<IncrementCounterUseCase> {
  private final Provider<CounterRepository> repositoryProvider;

  public IncrementCounterUseCase_Factory(Provider<CounterRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public IncrementCounterUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static IncrementCounterUseCase_Factory create(
      Provider<CounterRepository> repositoryProvider) {
    return new IncrementCounterUseCase_Factory(repositoryProvider);
  }

  public static IncrementCounterUseCase newInstance(CounterRepository repository) {
    return new IncrementCounterUseCase(repository);
  }
}
