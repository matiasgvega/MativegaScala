package data_structures

import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite

import models.{BinaryTreeNode, Dummy}

class TreeTest extends AnyFunSuite with BeforeAndAfter {

    val node11 = BinaryTreeNode(3, null, null)
    val node12 = BinaryTreeNode(7, null, null)
    val node21 = BinaryTreeNode(7, null, null)
    val node22 = BinaryTreeNode(3, null, null)
    val node2 = BinaryTreeNode(2, node21, node22)
    val node1 = BinaryTreeNode(2, node11, node12)
    val root = BinaryTreeNode(0, node1, node2)

    test("sum tree") {
      println(Tree.sum(root))
    }

}
