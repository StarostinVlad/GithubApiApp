package com.starostinvlad.githubapiapp.repositories_screen

import com.starostinvlad.githubapiapp.api.NetworkService
import com.starostinvlad.githubapiapp.base_mvp.BasePresenter
import kotlinx.coroutines.launch
import javax.inject.Inject

class RepositoriesFragmentPresenter @Inject constructor(private val api: NetworkService) :
    BasePresenter<RepositoriesFragmentContract>() {
    fun onLoaded() = launch {
        val repositories = api.getRepositiories()
        view?.showRepositories(repositories)
    }

}