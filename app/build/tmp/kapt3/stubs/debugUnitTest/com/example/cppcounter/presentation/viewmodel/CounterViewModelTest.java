package com.example.cppcounter.presentation.viewmodel;

import com.example.cppcounter.MainDispatcherRule;
import com.example.cppcounter.data.model.ClickMessage;
import com.example.cppcounter.data.repository.CounterRepositoryImpl;
import com.example.cppcounter.domain.repository.CounterRepository;
import io.mockk.*;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0007J\f\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0007J\b\u0010\u000f\u001a\u00020\fH\u0007J\f\u0010\u0010\u001a\u00060\fj\u0002`\rH\u0007R\u0013\u0010\u0003\u001a\u00020\u00048G\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/cppcounter/presentation/viewmodel/CounterViewModelTest;", "", "()V", "mainDispatcherRule", "Lcom/example/cppcounter/MainDispatcherRule;", "getMainDispatcherRule", "()Lcom/example/cppcounter/MainDispatcherRule;", "repository", "Lcom/example/cppcounter/domain/repository/CounterRepository;", "viewModel", "Lcom/example/cppcounter/presentation/viewmodel/CounterViewModel;", "increment should call repository increment", "", "Lkotlinx/coroutines/test/TestResult;", "loading should be true when increment called", "setup", "uiState should update when repository emits data", "app_debugUnitTest"})
@kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
public final class CounterViewModelTest {
    @org.jetbrains.annotations.NotNull()
    private final com.example.cppcounter.MainDispatcherRule mainDispatcherRule = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.cppcounter.domain.repository.CounterRepository repository = null;
    private com.example.cppcounter.presentation.viewmodel.CounterViewModel viewModel;
    
    public CounterViewModelTest() {
        super();
    }
    
    @org.junit.Rule()
    @org.jetbrains.annotations.NotNull()
    public final com.example.cppcounter.MainDispatcherRule getMainDispatcherRule() {
        return null;
    }
    
    @org.junit.Before()
    public final void setup() {
    }
}