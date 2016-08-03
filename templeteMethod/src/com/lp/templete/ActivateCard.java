package com.lp.templete;

/**
 * 
 * 〈制作饮料模板类〉<br>
 * 〈功能详细描述〉
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public abstract class ActivateCard {

    /**
     * 
     * 功能描述:开卡 <br>
     * 〈功能详细描述〉
     *
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    public final void activateCard() {
        getNum();
        writeInfo();
        if (!isVIP()) {
            waitMoment();
        } else {
            System.out.println("由于您是VIP，享有优先办理权");
        }
        getCard();
    }

    private void getNum() {
        System.out.println("排队取号……");
    }

    protected abstract void writeInfo();

    protected boolean isVIP() {
        return false;
    }

    private void waitMoment() {
        System.out.println("请耐心等候……");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void getCard() {
        System.out.println("提交填写信息\n柜台正在为您执行办卡手续，请稍后……");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("您的卡已经办好了，请走好。");
    }

}
