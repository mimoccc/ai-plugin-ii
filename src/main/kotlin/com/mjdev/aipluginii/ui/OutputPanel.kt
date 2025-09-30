package com.mimoccc.aipluginii.ui

import javax.swing.JPanel
import javax.swing.JTextArea
import javax.swing.JScrollPane
import java.awt.BorderLayout

class OutputPanel : JPanel() {
    private val outputArea = JTextArea().apply {
        isEditable = false
        lineWrap = true
        wrapStyleWord = true
    }

    init {
        layout = BorderLayout()
        add(JScrollPane(outputArea), BorderLayout.CENTER)
    }

    fun appendOutput(text: String) {
        outputArea.append(text)
        outputArea.append("\n\n")
    }

    fun clearOutput() {
        outputArea.text = ""
    }
}
