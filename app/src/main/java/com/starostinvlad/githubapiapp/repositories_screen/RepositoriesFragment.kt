package com.starostinvlad.githubapiapp.repositories_screen

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.starostinvlad.githubapiapp.R
import com.starostinvlad.githubapiapp.adapter.BaseAdapter
import com.starostinvlad.githubapiapp.adapter.RepositoriesFingerprint
import com.starostinvlad.githubapiapp.api.RepositoryEntity
import com.starostinvlad.githubapiapp.appComponent
import com.starostinvlad.githubapiapp.base_mvp.Presenter
import com.starostinvlad.githubapiapp.databinding.FragmentRepositoriesBinding
import javax.inject.Inject

class RepositoriesFragment : Fragment(R.layout.fragment_repositories),
    RepositoriesFragmentContract {

    private val binding: FragmentRepositoriesBinding by viewBinding()

    @Inject
    lateinit var presenter: RepositoriesFragmentPresenter

    private val adapter: BaseAdapter = BaseAdapter(RepositoriesFingerprint())

    override fun onAttach(context: Context) {
        context.appComponent.inject(this)
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            listRepository.adapter = adapter
        }
        presenter.attachView(this)
        presenter.onLoaded()
    }

    override fun onDestroyView() {
        presenter.detachView()
        super.onDestroyView()
    }

    override fun showRepositories(repositories: List<RepositoryEntity>) {
        adapter.setItems(repositories)
    }
}