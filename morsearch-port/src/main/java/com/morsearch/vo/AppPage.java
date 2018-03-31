package com.morsearch.vo;

import com.morsearch.common.constant.Constants;

/**
 * 页码控制
 * Created by leoli on 2017/10/16.
 */
public class AppPage {
       private static final long serialVersionUID = 1L;
        private Integer pageindex;/*当前页数*/
        private Integer pagecount ; /*返回总页数*/
        private Integer pagesize;/*每页页数*/
        private Integer rowcount;/*总记录*/

        public AppPage() {
            this.pagesize = 10;/*默认10条*/
        }

          public AppPage(int pageindex, int pagesize) {
             this.pageindex = pageindex;
             this.pagesize = pagesize;
            }

    public Integer getPagestart() {
        if (pageindex==null){pageindex=1;};
        return (pageindex-1)*pagesize;
//        return (pageIndex - 1)*(pageSize - 1);
    }

        public Integer getPagecount() {
            return pagecount;
        }

        public void setPagecount(Integer pagecount) {
            this.pagecount = pagecount;
        }


      public Integer getPageindex() {
        return pageindex;
    }

      public void setPageindex(String  pageindex) {
        if (pageindex==null||"".equals(pageindex)||"0".equals(pageindex)){pageindex="1";};
        this.pageindex =Integer.parseInt(pageindex);
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(String pagesize) {
        if (pagesize==null||"".equals(pagesize)||"0".equals(pagesize)){pagesize= Constants.DEFAULT_PAGESIZE+"";};
        this.pagesize =Integer.parseInt(pagesize);
        if (this.rowcount!=null){
            this.pagecount=(this.rowcount/this.pagesize)+(this.rowcount%this.pagesize>0?1:0);
        };
    }

        public Integer getRowcount() {
            return rowcount;
        }

        public void setRowcount(Integer rowcount) {
            this.rowcount = rowcount;
            this.pagecount=(this.rowcount/this.pagesize)+(this.rowcount%this.pagesize>0?1:0);
        }


}
