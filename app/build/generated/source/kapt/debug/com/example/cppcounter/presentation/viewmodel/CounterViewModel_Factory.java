package com.example.cppcounter.presentation.viewmodel;

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
public final class CounterViewModel_Factory implements Factory<CounterViewModel> {
  private final Provider<CounterRepository> repositoryProvider;

  public CounterViewModel_Factory(Provider<CounterRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public CounterViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static CounterViewModel_Factory create(Provider<CounterRepository> repositoryProvider) {
    return new CounterViewModel_Factory(repositoryProvider);
  }

  public static CounterViewModel newInstance(CounterRepository repository) {
    return new CounterViewModel(repository);
  }
}
