package com.example.facebookclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.facebookclone.databinding.FacebookListItemBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class FacebookRVAdapter(var facebookList: List<FacebookData>): RecyclerView.Adapter<FacebookViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FacebookViewHolder {
        var binding = FacebookListItemBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return FacebookViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FacebookViewHolder, position: Int) {
        var facebookData = facebookList[position]
        holder.binding.apply {
            tvName.text = facebookData.displayName
            tvPosts.text = facebookData.post
            tvReactions.text = facebookData.reactionCount
            tvComment.text = facebookData.commentsCount.toString()


          Picasso
              .get()
              .load(facebookData.avatar)
              .resize(40,40)
              .centerCrop()
              .transform(CropCircleTransformation())
              .into(holder.binding.ivAvatar)




        }
    }

    override fun getItemCount(): Int {
        return facebookList.size
    }
}



class FacebookViewHolder(var binding: FacebookListItemBinding): RecyclerView.ViewHolder(binding.root)