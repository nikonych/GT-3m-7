package com.example.gt_3m_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.gt_3m_7.databinding.FragmentMainBinding
import java.text.FieldPosition


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var RickList: ArrayList<User>

    companion object {
        const val KEY_FOR_USER = "USER"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()

        val adapter = RickAdapter(RickList, this::onClick)
        binding.rcViewRick.adapter = adapter

    }

    private fun loadData() {
        RickList = ArrayList()
        RickList.add(User("Rick Sanchez", "Alive", R.drawable.rick))
        RickList.add(User("Morty Smith", "Alive", R.drawable.morty))
        RickList.add(User("Albert Einstein", "Alive", R.drawable.albert))
        RickList.add(User("Jerry Smith", "Alive", R.drawable.jerry))
        RickList.add(User("Rick Sanchez", "Alive", R.drawable.rick))
        RickList.add(User("Morty Smith", "Alive", R.drawable.morty))
        RickList.add(User("Albert Einstein", "Alive", R.drawable.albert))
        RickList.add(User("Jerry Smith", "Alive", R.drawable.jerry))
    }

    private fun onClick(position: Int){
        findNavController().navigate(MainFragmentDirections.actionMainFragmentToDetailFragment(RickList[position]))
    }
}