package com.example.android4homework5mc6p.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android4homework5mc6p.ui.adapter.RickAndMortyAdapter
import com.example.android4homework5mc6p.R
import com.example.android4homework5mc6p.databinding.FragmentRickAndMortyBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RickAndMortyFragment : Fragment(R.layout.fragment_rick_and_morty) {
    private val binding by viewBinding(FragmentRickAndMortyBinding::bind)
    private val viewModel by viewModels<RickAndMortyViewModel>()
    private val rickAndMortyAdapter = RickAndMortyAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupObserver()
    }

    private fun initialize() {
        binding.rvRickAndMorty.adapter = rickAndMortyAdapter
    }

    private fun setupObserver() {
        viewModel.locationCharacter.observe(viewLifecycleOwner) {
            rickAndMortyAdapter.submitList(it)
        }
    }
}