/* Generated By:JJTree: Do not edit this line. ASTInnerTypeConstraints.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public
class ASTInnerTypeConstraints extends SimpleNode {
  public ASTInnerTypeConstraints(int id) {
    super(id);
  }

  public ASTInnerTypeConstraints(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=15c842a5b0455d3a5c04855c020d44ab (do not edit this line) */