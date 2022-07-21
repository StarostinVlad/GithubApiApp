package com.starostinvlad.githubapiapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.starostinvlad.githubapiapp.R
import com.starostinvlad.githubapiapp.api.RepositoryEntity
import com.starostinvlad.githubapiapp.databinding.ItemRepositoryBinding

class RepositoriesFingerprint : ItemFingerprint<ItemRepositoryBinding, RepositoryEntity> {
    override fun isRelativeItem(item: Item): Boolean = item is RepositoryEntity

    override fun getLayoutId(): Int = R.layout.item_repository

    override fun getViewHolder(
        layoutInflater: LayoutInflater,
        parent: ViewGroup
    ): BaseViewHolder<ItemRepositoryBinding, RepositoryEntity> {
        val binding =
            ItemRepositoryBinding.inflate(layoutInflater, parent, false)
        return ItemRepositoryViewHolder(binding)
    }
}

class ItemRepositoryViewHolder(binding: ItemRepositoryBinding) :
    BaseViewHolder<ItemRepositoryBinding, RepositoryEntity>(binding) {
    override fun onBind(item: RepositoryEntity) = with(binding) {
        idRepository.text = item.id
        titleRepository.text = item.name
        ownerLoginRepository.text = item.owner.login
        descriptionRepository.text = item.description
    }

}
