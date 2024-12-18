package com.example.ucp2.repository

import com.example.ucp2.Entity.Dosen
import kotlinx.coroutines.flow.Flow

interface RepositoryDsn {
    suspend fun insertDsn(dosen: Dosen)

    fun getAllDsn() : Flow<List<Dosen>>
}