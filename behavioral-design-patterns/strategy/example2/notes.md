# Java Examples: Strategy Design Pattern in the Java API

This document explains how the **Strategy Design Pattern** is used in the Java API through examples of `Collections.sort`, `Comparator`, `File.list`, and `ThreadPoolExecutor`.

***

## 1. `Collections.sort` with `Comparator`

The `Collections.sort` method uses the **Strategy Pattern** by allowing you to pass a `Comparator` to define the sorting behavior. The `Comparator` interface encapsulates the comparison logic, enabling you to switch between different sorting strategies (e.g., natural order, reverse order) at runtime.

***

## 2. `Comparator` Example

The `Comparator` interface is a classic example of the **Strategy Pattern**. It allows you to define custom sorting logic, such as sorting strings by their length or alphabetically. By passing different `Comparator` implementations to methods like `Arrays.sort`, you can dynamically change the sorting behavior without modifying the underlying data structures.

***

## 3. `File.list` with `FilenameFilter`

The `File.list` method uses the **Strategy Pattern** by accepting a `FilenameFilter` to filter files in a directory. The `FilenameFilter` interface defines a strategy for filtering filenames, such as listing only files with a specific extension (e.g., `.java`). This allows you to decouple the filtering logic from the file listing process.

***

## 4. `ThreadPoolExecutor` with `RejectedExecutionHandler`

The `ThreadPoolExecutor` class uses the **Strategy Pattern** for handling rejected tasks. By providing a `RejectedExecutionHandler`, you can define how tasks that cannot be executed by the thread pool should be handled (e.g., aborting, retrying, or executing in the caller's thread). This makes the behavior of the thread pool flexible and configurable.

***

## Summary

These examples demonstrate how the **Strategy Design Pattern** is deeply embedded in the Java API. By encapsulating algorithms or behaviors into interfaces (e.g., `Comparator`, `FilenameFilter`, `RejectedExecutionHandler`), Java allows you to dynamically switch between different strategies at runtime, promoting flexibility and maintainability.