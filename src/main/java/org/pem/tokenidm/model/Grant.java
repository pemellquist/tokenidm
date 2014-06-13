package org.pem.tokenidm.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "grant")
public class Grant {
   private Integer grantid;
   private String description;
   private Integer tenantid;
   private Integer userid;
   private Integer roleid;

   public Integer getGrantid() {
      return grantid;
   }

   public void setGrantid(Integer id) {
      this.grantid = id;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public Integer getTenantid() {
      return tenantid;
   }

   public void setTenantid(Integer id) {
      this.tenantid = id;
   }
 
   public Integer getUserid() {
      return userid;
   }

   public void setUserid(Integer id) {
      this.userid = id;
   }

   public Integer getRoleid() {
      return roleid;
   }

   public void setRoleid(Integer id) {
      this.roleid = id;
   }

}
