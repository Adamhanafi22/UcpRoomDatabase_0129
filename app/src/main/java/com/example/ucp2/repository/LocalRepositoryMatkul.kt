package com.example.ucp2.repository

import com.example.ucp2.Entity.MataKuliah
import com.example.ucp2.dao.MatkulDao
import kotlinx.coroutines.flow.Flow

class LocalRepositoryMatkul (
    private val matkulDao: MatkulDao
) : RepositoryMatkul {
    override suspend fun insertMatkul(mataKuliah: MataKuliah){
        matkulDao.insertMataKuliah(mataKuliah)
    }
    // getAllMhs
    override fun getAllMatkul (): Flow<List<MataKuliah>> {
        return  matkulDao.getAllMataKuliah()
    }
    // getMhs
    override fun getMatkul(kode: String): Flow<MataKuliah> {
        return matkulDao.getMataKuliah(kode)
    }
    // deletedMhs
    override suspend fun deletedMatkul(mataKuliah: MataKuliah) {
        matkulDao.deletedMataKuliah(mataKuliah)
    }
    // updateMhs
    override suspend fun updateMatkul(mataKuliah: MataKuliah) {
        matkulDao.updateMataKuliah(mataKuliah)
    }
}