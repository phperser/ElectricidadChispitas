package com.phpeser.chispas.data;

import com.phpeser.chispas.domain.models.IVAType;

import java.util.List;
import java.util.TreeMap;

public class MemIVATypeDataStore implements IVATypeDataStore{

    private TreeMap<String, IVAType> dataStore = new TreeMap<String, IVAType>();


    @Override
    public void saveIVAType(IVAType ivaType) {
        dataStore.put(String.valueOf(ivaType.getType()), ivaType);
    }

    @Override
    public void deleteIVAType(IVAType ivaType) {
        dataStore.remove(ivaType);
    }

    @Override
    public void updateIVAType(IVAType ivaType) {
        dataStore.replace(String.valueOf(ivaType.getType()), ivaType);
    }

    @Override
    public List<IVAType> getAllIVAType() {
        return dataStore.values().stream().toList();
    }

}
