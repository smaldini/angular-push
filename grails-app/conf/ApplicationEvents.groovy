import angular.push.Author

events = {
    'afterInsert' browser:true, namespace:'gorm', filter:Author
    'afterDelete' browser:true, namespace:'gorm', filter:Author
    'afterUpdate' browser:true, namespace:'gorm', filter:Author
}