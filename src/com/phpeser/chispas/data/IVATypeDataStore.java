package com.phpeser.chispas.data;

import com.phpeser.chispas.domain.models.IVAType;

import java.util.List;

public interface IVATypeDataStore {

    void saveIVAType(IVAType ivaType);

    void  deleteIVAType(IVAType ivaType);

    void updateIVAType(IVAType ivaType);

    List<IVAType> getAllIVAType();
}
