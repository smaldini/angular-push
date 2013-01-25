grails.servlet.version = "3.0" // Change depending on target container compliance (2.5 or 3.0)
grails.project.target.level = 1.7
grails.project.source.level = 1.7

grails.tomcat.nio = true

grails.project.dependency.resolution = {

    // inherit Grails' default dependencies
    inherits("global") {
        excludes 'grails-plugin-filters',
                "grails-plugin-mimetypes"
    }

    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()
        mavenRepo "https://oss.sonatype.org/content/repositories/snapshots"
    }


    plugins {
        compile ":events-push:1.0.M7"
        compile ":vertx:1.0-SNAPSHOT"
        runtime ":angular-scaffolding:1.0-SNAPSHOT"
        runtime ":hibernate:$grailsVersion"
        runtime ":jquery:1.8.3"
        build ":tomcat:$grailsVersion"
    }
}
