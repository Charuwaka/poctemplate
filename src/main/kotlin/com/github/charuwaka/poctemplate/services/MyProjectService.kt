package com.github.charuwaka.poctemplate.services

import com.intellij.openapi.project.Project
import com.github.charuwaka.poctemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
