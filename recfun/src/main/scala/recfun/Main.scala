package recfun

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int =
    if (r == 0 || c == r || c == 0)
      1
    else
      pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
    * Exercise 2
    */
  @tailrec
  def balance(chars: List[Char], open: Int = 0): Boolean =
    if (open < 0)
      false
    else if (chars.isEmpty )
      open == 0
    else if (chars.head == '(')
      balance(chars.tail, open + 1)
    else if (chars.head == ')')
      balance(chars.tail, open -1)
    else
      balance(chars.tail, open)

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
