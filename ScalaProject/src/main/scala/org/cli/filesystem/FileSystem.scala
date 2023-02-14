package org.cli.filesystem

import org.cli.commands.Command
import org.cli.files.Directory

import java.util.Scanner

object FileSystem extends App {

  val root = Directory.ROOT
  var state = State(root, root)
  val scanner = new Scanner(System.in)

  while (true) {
    state.show()
    state = Command.from(scanner.nextLine()).apply(state)
  }

}
