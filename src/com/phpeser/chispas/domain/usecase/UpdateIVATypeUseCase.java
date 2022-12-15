package com.phpeser.chispas.domain.usecase;

import com.phpeser.chispas.data.IVATypeDataStore;
import com.phpeser.chispas.data.MemIVATypeDataStore;
import com.phpeser.chispas.domain.models.IVAType;

public class UpdateIVATypeUseCase {

    private  IVATypeDataStore ivaTypeDataStore;

    public UpdateIVATypeUseCase(IVATypeDataStore ivaTypeDataStore){
        this.ivaTypeDataStore = ivaTypeDataStore;
    }

    public void execute(IVAType ivaType){
        IVATypeDataStore ivaTypeDataStore = new MemIVATypeDataStore();
        ivaTypeDataStore.updateIVAType(ivaType);
    }
}
