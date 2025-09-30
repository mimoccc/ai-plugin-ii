package com.mimoccc.aipluginii.ui

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.components.JBPanel
import javax.swing.JComponent

class MainToolWindowFactory : ToolWindowFactory {
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val panel = MainToolWindow(project)
        toolWindow.component.add(panel)
    }
}

class MainToolWindow(project: Project) : JBPanel<MainToolWindow>() {
    init {
        layout = java.awt.BorderLayout()

        // Compose UI or simple Swing placeholders for start
        add(ProviderSelector(), java.awt.BorderLayout.WEST)
        add(OutputPanel(), java.awt.BorderLayout.CENTER)
        add(InputPanel(), java.awt.BorderLayout.SOUTH)
    }
}
