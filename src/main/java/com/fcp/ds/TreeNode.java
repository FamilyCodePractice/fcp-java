package com.fcp.ds;

import java.util.List;

/**
 * A general tree node that may have multiple children.
 * @param <T>
 */
public class TreeNode<T> {
    T value;
    List<TreeNode<T>> childs;
}
