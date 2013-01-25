modules = {
    bootstrap {
        defaultBundle 'app'
        dependsOn 'jquery'
        resource url: 'bootstrap/css/bootstrap.min.css'
        resource url: 'bootstrap/js/bootstrap.min.js'
    }
    'scaffolding-resources' {
        defaultBundle 'app'
        resource id: 'js',  url: [plugin: 'angular-scaffolding', dir: 'js', file: 'grails-default.js']
        resource id: 'css', url: [plugin: 'angular-scaffolding', dir: 'css', file: 'scaffolding.css']
    }
    'font-awesome' {
        defaultBundle 'app'
        resource url: 'font-awesome/css/font-awesome.css'
    }
    'ui-common' {
        defaultBundle 'app'
        dependsOn 'bootstrap', 'font-awesome'
        resource url: 'css/ui-common.css'
    }

    'angular-push-scaffolding' {
        dependsOn 'jquery', 'angular-resource', 'ui-common', 'scaffolding-resources', 'bootstrap', 'grailsEvents'
        resource id: 'js', url: [dir: 'js', file: 'scaffolding.js']
    }
}