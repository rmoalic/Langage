/* Generated By:JJTree: Do not edit this line. ASTvalue.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package grammaireV3;

public
class ASTvalue extends SimpleNode {
  public ASTvalue(int id) {
    super(id);
  }

  public ASTvalue(Lang p, int id) {
    super(p, id);
  }

  public void run() throws Exception {
	  if (this.jjtGetNumChildren() == 0) {
		  MyNode.push(this.value);
	  } else {
		  assert this.jjtGetNumChildren() == 1;
		  ((MyNode)this.jjtGetChild(0)).run();
	  }
  }
}
/* JavaCC - OriginalChecksum=a072ef8f2f17aa75d90006140ff81500 (do not edit this line) */