package com.example.ucp2.repository

import com.example.ucp2.Entity.Dosen
import com.example.ucp2.dao.DosenDao
import kotlinx.coroutines.flow.Flow

class LocalRepositoryDsn (
    private val dosenDao: DosenDao
) : RepositoryDsn {

    override suspend fun insertDsn(dosen: Dosen){
        dosenDao.insertDosen(dosen)
    }
    // getAllMhs
    override fun getAllDsn (): Flow<List<Dosen>> {
        return  dosenDao.getAllDosen()
    }
}