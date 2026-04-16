package com.example.cppcounter.data.repository;

import com.example.cppcounter.data.model.ClickMessage;
import com.example.cppcounter.domain.repository.CounterRepository;
import com.example.nativelib.NativeBridge;
import kotlinx.coroutines.flow.Flow;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/cppcounter/data/repository/CounterRepositoryImpl;", "Lcom/example/cppcounter/domain/repository/CounterRepository;", "()V", "messageList", "", "Lcom/example/cppcounter/data/model/ClickMessage;", "increment", "", "observeMessages", "Lkotlinx/coroutines/flow/Flow;", "", "app_debug"})
public final class CounterRepositoryImpl implements com.example.cppcounter.domain.repository.CounterRepository {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.cppcounter.data.model.ClickMessage> messageList = null;
    
    @javax.inject.Inject()
    public CounterRepositoryImpl() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.cppcounter.data.model.ClickMessage>> observeMessages() {
        return null;
    }
    
    @java.lang.Override()
    public void increment() {
    }
}