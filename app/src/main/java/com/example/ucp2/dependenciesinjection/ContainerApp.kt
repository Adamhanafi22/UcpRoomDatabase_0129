package com.example.ucp2.dependenciesinjection

import android.content.Context
import com.example.ucp2.database.KrsDataBase
import com.example.ucp2.repository.LocalRepositoryDsn
import com.example.ucp2.repository.LocalRepositoryMatkul
import com.example.ucp2.repository.RepositoryDsn
import com.example.ucp2.repository.RepositoryMatkul

interface InterfaceContainerApp {

    val repositoryMatkul: RepositoryMatkul
    val repositoryDsn: RepositoryDsn
}

class ContainerApp (private val context: Context): InterfaceContainerApp{
    override val repositoryMatkul: RepositoryMatkul by lazy{
        LocalRepositoryMatkul(KrsDataBase.getDatabase(context).MatkulDao())
    }
    override val repositoryDsn : RepositoryDsn by lazy{
        LocalRepositoryDsn(KrsDataBase.getDatabase(context).DosenDao())
    }

}




