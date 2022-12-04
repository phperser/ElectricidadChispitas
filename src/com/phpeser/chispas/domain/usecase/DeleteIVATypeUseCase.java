package com.phpeser.chispas.domain.usecase;

import com.phpeser.chispas.data.IVATypeDataStore;
import com.phpeser.chispas.domain.models.IVAType;

public class DeleteIVATypeUseCase {

    private IVATypeDataStore ivaTypeDataStore;

    public DeleteIVATypeUseCase(IVATypeDataStore ivaTypeDataStore){
        this.ivaTypeDataStore = ivaTypeDataStore;
    }

    public void execute(IVAType ivaType){
        ivaTypeDataStore.deleteIVAType(ivaType);
    }
}
