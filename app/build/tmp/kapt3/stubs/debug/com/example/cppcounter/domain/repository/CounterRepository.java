package com.example.cppcounter.domain.repository;

import com.example.cppcounter.data.model.ClickMessage;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/example/cppcounter/domain/repository/CounterRepository;", "", "increment", "", "observeMessages", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/cppcounter/data/model/ClickMessage;", "app_debug"})
public abstract interface CounterRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.cppcounter.data.model.ClickMessage>> observeMessages();
    
    public abstract void increment();
}