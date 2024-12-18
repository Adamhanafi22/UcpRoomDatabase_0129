package com.example.ucp2.repository

import com.example.ucp2.Entity.MataKuliah
import com.example.ucp2.dao.MatkulDao
import kotlinx.coroutines.flow.Flow

interface RepositoryMatkul {

    suspend fun insertMatkul(mataKuliah: MataKuliah)

    fun getAllMatkul() : Flow<List<MataKuliah>>

    fun getMatkul(kode: String): Flow<MataKuliah>

    suspend fun deletedMatkul (mataKuliah: MataKuliah)

    suspend fun updateMatkul(mataKuliah: MataKuliah)

}