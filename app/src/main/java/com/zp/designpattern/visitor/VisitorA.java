package com.zp.designpattern.visitor;

/**
 * Created by ghw on 16/7/11.
 */
public class VisitorA implements Visitor {
    @Override
    public void visitNodeA(NodeA nodeA) {
        System.out.println("---Testing pattern visitor, this is VisitorA...---");
        nodeA.operation();
    }

    @Override
    public void visitNodeB(NodeB nodeB) {
        System.out.println("---Testing pattern visitor, this is VisitorA...---");
        nodeB.operation();
    }
}
