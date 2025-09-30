package com.mimoccc.aipluginii.ui

import javax.swing.JButton
import javax.swing.JPanel
import javax.swing.JTextArea
import java.awt.BorderLayout

class InputPanel : JPanel() {
    val inputArea = JTextArea(5, 80)
    val sendButton = JButton("Send")

    init {
        layout = BorderLayout()
        add(inputArea, BorderLayout.CENTER)
        add(sendButton, BorderLayout.EAST)
    }

    fun getInputText(): String = inputArea.text
    fun clearInput() = inputArea.text = ""
}
