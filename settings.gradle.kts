pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }

        google()

        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "OpenCVSimple"
include(":app")
include("camera-calibration")
include("color-blob-detection")
include("face-detection")
include("image-manipulations")
include("mobilenet-objdetect")
include("qr-detection")
include("tutorial-1-camerapreview")
include("tutorial-2-mixedprocessing")
include("tutorial-3-cameracontrol")
include("tutorial-4-opencl")
include("video-recorder")
include("15-puzzle")
