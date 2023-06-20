package com.lucky.log_in_assessment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

data class signUpRvAdapter(var signUp: List<DataSignUp>): RecyclerView.Adapter<SignUpViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SignUpViewHolder {
        var binding = SignUpBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SignUpBinding(binding)
    }

    override fun onBindViewHolder(holder: SignUpViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
       return signUp.size
    }
}
class SignUpViewHolder(var binding: Sign_Up): RecyclerView.ViewHolder(binding.root){

}
