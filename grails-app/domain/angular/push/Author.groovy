package angular.push

class Author {

    String name
    String email

    static constraints = {
        name blank:false, size: 2..80
        email email:true, size: 4..80
    }
}
