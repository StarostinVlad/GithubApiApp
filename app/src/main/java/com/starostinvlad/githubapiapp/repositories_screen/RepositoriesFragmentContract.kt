package com.starostinvlad.githubapiapp.repositories_screen

import com.starostinvlad.githubapiapp.api.RepositoryEntity
import com.starostinvlad.githubapiapp.base_mvp.BaseView

interface RepositoriesFragmentContract : BaseView {
    fun showRepositories(repositories: List<RepositoryEntity>)
}