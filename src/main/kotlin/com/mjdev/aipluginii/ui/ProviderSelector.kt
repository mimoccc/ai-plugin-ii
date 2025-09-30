package com.mimoccc.aipluginii.ui

import javax.swing.JComboBox
import javax.swing.JPanel

class ProviderSelector : JPanel() {
    private val providers = arrayOf("Perplexity", "Ollama", "Hugging Face")
    val comboBox = JComboBox(providers)

    init {
        add(comboBox)
    }

    fun getSelectedProvider(): String = comboBox.selectedItem as String
}
