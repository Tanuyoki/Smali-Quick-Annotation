package com.github.tanuyoki.smaliquickannotation.services

import com.github.tanuyoki.smaliquickannotation.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
