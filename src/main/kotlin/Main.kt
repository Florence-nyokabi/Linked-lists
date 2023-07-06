fun main(){
    createLinkedList()

}
class Node(var name: String){
    var next: Node? = null
}

fun createLinkedList(){
    var node1 = Node("Diana")
    var node2 = Node("Maureen")
    var node3 = Node("Clever")
    var node4 = Node("Ivy")
    var node5 = Node("Nyeliep")
    var node6 = Node("Cynthia")
    var node7 = Node("Marion")
    var node8 = Node("Rose")

    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = node6
    node6.next = node7
    node7.next = node8

    var current: Node? = node1

//    Traversing linked lists

//    Does not show the last element

//    while(current?.next != null){
//        println(current.name)
//        current = current.next
//    }

    while(current != null){
        println(current.name)
        current = current.next
    }


}