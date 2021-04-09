package com.apollographql.apollo3.compiler

interface PackageNameProvider {
  fun operationPackageName(filePath: String): String
  fun fragmentPackageName(filePath: String): String

  class Flat(val packageName: String) : PackageNameProvider {
    override fun operationPackageName(filePath: String) = packageName
    override fun fragmentPackageName(filePath: String) = "$packageName.fragment"
  }
}