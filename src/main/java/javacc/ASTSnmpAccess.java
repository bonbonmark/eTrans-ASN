/* Generated By:JJTree: Do not edit this line. ASTSnmpAccess.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public
class ASTSnmpAccess extends SimpleNode {
  public ASTSnmpAccess(int id) {
    super(id);
  }

  public ASTSnmpAccess(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=ab4e9d1836498d21dff8091993ad63b2 (do not edit this line) */
