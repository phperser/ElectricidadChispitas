package com.phpeser.chispas.domain.usecase;

import com.phpeser.chispas.data.IVATypeDataStore;
import com.phpeser.chispas.data.MemIVATypeDataStore;
import com.phpeser.chispas.domain.models.IVAType;

import java.util.List;

public class GetIVATypeUseCase {

    private  IVATypeDataStore ivaTypeDataStore;

    public GetIVATypeUseCase(IVATypeDataStore ivaTypeDataStore){
        this.ivaTypeDataStore = ivaTypeDataStore;
    }

    public List<IVAType> execute(){
        IVATypeDataStore ivaTypeDataStore = new MemIVATypeDataStore();
        return ivaTypeDataStore.getAllIVAType();
    }
}
