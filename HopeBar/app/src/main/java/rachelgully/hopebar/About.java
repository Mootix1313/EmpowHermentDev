package rachelgully.hopebar;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class About extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        WebView webview = new WebView(this);
        setContentView(webview);
        String summary = "<!DOCTYPE html>\n" +
                "<!--[if lt IE 7 ]><html class=\"ie ie6\" lang=\"en-US\"> <![endif]-->\n" +
                "<!--[if IE 7 ]><html class=\"ie ie7\" lang=\"en-US\"> <![endif]-->\n" +
                "<!--[if IE 8 ]><html class=\"ie ie8\" lang=\"en-US\"> <![endif]-->\n" +
                "<!--[if (gte IE 9)|!(IE)]><!--><html lang=\"en-US\"> <!--<![endif]-->\n" +
                "\n" +
                "<head>\n" +
                "\t\n" +
                "\t<!-- Basic Page Needs\n" +
                "  \t================================================== -->\n" +
                "\t<meta charset=\"UTF-8\" />\n" +
                "\t<title>Buy One Nourish Two | Hope Bar</title>\n" +
                "\t\n" +
                "\t<!--[if lt IE 9]>\n" +
                "\t\t<script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n" +
                "\t<![endif]-->\n" +
                "\n" +
                "\t<!-- Mobile Specific Metas\n" +
                "  \t================================================== -->\n" +
                "\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "\t\n" +
                "\t<link rel=\"profile\" href=\"http://gmpg.org/xfn/11\" />\n" +
                "\t<link rel=\"shortcut icon\" href=\"http://hopebar.com/wp-content/uploads/2015/03/hope-bar-com-logo.png\" type=\"image/x-icon\" />\n" +
                "\t<link rel=\"pingback\" href=\"http://hopebar.com/xmlrpc.php\" />\n" +
                "\t<link rel=\"alternate\" type=\"application/rss+xml\" title=\"Hope Bar\" href=\"http://hopebar.com/feed/\" />\n" +
                "\t<link rel=\"alternate\" type=\"application/atom+xml\" title=\"Hope Bar\" href=\"http://hopebar.com/feed/atom/\" />\n" +
                "\t\n" +
                "\t<link href='http://fonts.googleapis.com/css?family=Oswald:400,700,300' rel='stylesheet' type='text/css'>\n" +
                "\t<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\n" +
                "\t<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900,200italic,300italic,400italic,600italic,700italic,900italic' rel='stylesheet' type='text/css'>\n" +
                "\t\n" +
                "\t<meta name='robots' content='noindex,follow' />\n" +
                "<link rel=\"alternate\" type=\"application/rss+xml\" title=\"Hope Bar &raquo; Feed\" href=\"http://hopebar.com/feed/\" />\n" +
                "<link rel=\"alternate\" type=\"application/rss+xml\" title=\"Hope Bar &raquo; Comments Feed\" href=\"http://hopebar.com/comments/feed/\" />\n" +
                "<link rel=\"alternate\" type=\"application/rss+xml\" title=\"Hope Bar &raquo; Buy One Nourish Two Comments Feed\" href=\"http://hopebar.com/nourish-two/feed/\" />\n" +
                "\t\t<script type=\"text/javascript\">\n" +
                "\t\t\twindow._wpemojiSettings = {\"baseUrl\":\"http:\\/\\/s.w.org\\/images\\/core\\/emoji\\/72x72\\/\",\"ext\":\".png\",\"source\":{\"concatemoji\":\"http:\\/\\/hopebar.com\\/wp-includes\\/js\\/wp-emoji-release.min.js?ver=4.2.2\"}};\n" +
                "\t\t\t!function(a,b,c){function d(a){var c=b.createElement(\"canvas\"),d=c.getContext&&c.getContext(\"2d\");return d&&d.fillText?(d.textBaseline=\"top\",d.font=\"600 32px Arial\",\"flag\"===a?(d.fillText(String.fromCharCode(55356,56812,55356,56807),0,0),c.toDataURL().length>3e3):(d.fillText(String.fromCharCode(55357,56835),0,0),0!==d.getImageData(16,16,1,1).data[0])):!1}function e(a){var c=b.createElement(\"script\");c.src=a,c.type=\"text/javascript\",b.getElementsByTagName(\"head\")[0].appendChild(c)}var f,g;c.supports={simple:d(\"simple\"),flag:d(\"flag\")},c.DOMReady=!1,c.readyCallback=function(){c.DOMReady=!0},c.supports.simple&&c.supports.flag||(g=function(){c.readyCallback()},b.addEventListener?(b.addEventListener(\"DOMContentLoaded\",g,!1),a.addEventListener(\"load\",g,!1)):(a.attachEvent(\"onload\",g),b.attachEvent(\"onreadystatechange\",function(){\"complete\"===b.readyState&&c.readyCallback()})),f=c.source||{},f.concatemoji?e(f.concatemoji):f.wpemoji&&f.twemoji&&(e(f.twemoji),e(f.wpemoji)))}(window,document,window._wpemojiSettings);\n" +
                "\t\t</script>\n" +
                "\t\t<style type=\"text/css\">\n" +
                "img.wp-smiley,\n" +
                "img.emoji {\n" +
                "\tdisplay: inline !important;\n" +
                "\tborder: none !important;\n" +
                "\tbox-shadow: none !important;\n" +
                "\theight: 1em !important;\n" +
                "\twidth: 1em !important;\n" +
                "\tmargin: 0 .07em !important;\n" +
                "\tvertical-align: -0.1em !important;\n" +
                "\tbackground: none !important;\n" +
                "\tpadding: 0 !important;\n" +
                "}\n" +
                "</style>\n" +
                "<link rel='stylesheet' id='layerslider-css'  href='http://hopebar.com/wp-content/plugins/LayerSlider/static/css/layerslider.css?ver=5.3.0' type='text/css' media='all' />\n" +
                "<link rel='stylesheet' id='ls-google-fonts-css'  href='http://fonts.googleapis.com/css?family=Lato:100,300,regular,700,900%7COpen+Sans:300%7CIndie+Flower:regular%7COswald:300,regular,700&#038;subset=latin%2Clatin-ext' type='text/css' media='all' />\n" +
                "<link rel='stylesheet' id='contact-form-7-css'  href='http://hopebar.com/wp-content/plugins/contact-form-7/includes/css/styles.css?ver=4.1.2' type='text/css' media='all' />\n" +
                "<link rel='stylesheet' id='rs-plugin-settings-css'  href='http://hopebar.com/wp-content/plugins/revslider/rs-plugin/css/settings.css?rev=4.6.0&#038;ver=4.2.2' type='text/css' media='all' />\n" +
                "<style id='rs-plugin-settings-inline-css' type='text/css'>\n" +
                ".tp-caption a{color:#ff7302;text-shadow:none;-webkit-transition:all 0.2s ease-out;-moz-transition:all 0.2s ease-out;-o-transition:all 0.2s ease-out;-ms-transition:all 0.2s ease-out}.tp-caption a:hover{color:#ffa902}\n" +
                "</style>\n" +
                "<link rel='stylesheet' id='wpmenucart-icons-css'  href='http://hopebar.com/wp-content/plugins/woocommerce-menu-bar-cart/css/wpmenucart-icons.css?ver=4.2.2' type='text/css' media='all' />\n" +
                "<link rel='stylesheet' id='wpmenucart-css'  href='http://hopebar.com/wp-content/plugins/woocommerce-menu-bar-cart/css/wpmenucart-main.css?ver=4.2.2' type='text/css' media='all' />\n" +
                "<link rel='stylesheet' id='omc-mv-ref-tools-css'  href='http://hopebar.com/wp-content/plugins/wpomc-mv-referrer-tools/resources/css/omc-mv-ref-tools-plugin.css?ver=4.2.2' type='text/css' media='all' />\n" +
                "<link rel='stylesheet' id='hopebar-custom-css'  href='http://hopebar.com/wp-content/themes/keisus-child/custom.css?ver=4.2.2' type='text/css' media='all' />\n" +
                "<link rel='stylesheet' id='st-font-css'  href='http://fonts.googleapis.com/css?family=Open+Sans%3A300%2C300italic%2Cregular%2Citalic%2C600%2C600italic%2C700%2C700italic%2C800%2C800italic&#038;ver=4.2.2' type='text/css' media='all' />\n" +
                "<link rel='stylesheet' id='st-font-heading-css'  href='http://fonts.googleapis.com/css?family=Open+Sans%3A300%2C300italic%2Cregular%2Citalic%2C600%2C600italic%2C700%2C700italic%2C800%2C800italic&#038;ver=4.2.2' type='text/css' media='all' />\n" +
                "<link rel='stylesheet' id='st-font-subtitle-css'  href='http://fonts.googleapis.com/css?family=Open+Sans%3A300%2C300italic%2Cregular%2Citalic%2C600%2C600italic%2C700%2C700italic%2C800%2C800italic&#038;ver=4.2.2' type='text/css' media='all' />\n" +
                "<link rel='stylesheet' id='st-prettyPhoto-css'  href='http://hopebar.com/wp-content/themes/keisus/js/prettyPhoto/prettyPhoto.css?ver=3.1.5' type='text/css' media='all' />\n" +
                "<link rel='stylesheet' id='st-bootstrap-css'  href='http://hopebar.com/wp-content/themes/keisus/css/bootstrap.min.css?ver=3.1.1' type='text/css' media='all' />\n" +
                "<link rel='stylesheet' id='st-layout-css'  href='http://hopebar.com/wp-content/themes/keisus/css/layout.css?ver=1.2' type='text/css' media='all' />\n" +
                "<link rel='stylesheet' id='st-responsive-css'  href='http://hopebar.com/wp-content/themes/keisus/css/responsive.css?ver=1.2' type='text/css' media='all' />\n" +
                "<link rel='stylesheet' id='st-skin-css'  href='http://hopebar.com/wp-content/themes/keisus/css/skins/skin_05.css?ver=1.2' type='text/css' media='all' />\n" +
                "<link rel='stylesheet' id='st-skin-custom-css'  href='http://hopebar.com/wp-content/themes/keisus/css/custom.php?st_id=20&#038;ver=1.2' type='text/css' media='all' />\n" +
                "<link rel='stylesheet' id='st-style-css'  href='http://hopebar.com/wp-content/themes/keisus-child/style.css?ver=1.2' type='text/css' media='all' />\n" +
                "<link rel='stylesheet' id='js_composer_front-css'  href='http://hopebar.com/wp-content/plugins/js_composer/assets/css/js_composer.css?ver=4.4.3' type='text/css' media='all' />\n" +
                "<link rel='stylesheet' id='ultimate-style-min-css'  href='http://hopebar.com/wp-content/plugins/Ultimate_VC_Addons/assets/min-css/ultimate.min.css?ver=3.11.1' type='text/css' media='all' />\n" +
                "<link rel='stylesheet' id='bsf-Defaults-css'  href='http://hopebar.com/wp-content/uploads/smile_fonts/Defaults/Defaults.css?ver=4.2.2' type='text/css' media='all' />\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/plugins/LayerSlider/static/js/greensock.js?ver=1.11.8'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-includes/js/jquery/jquery.js?ver=1.11.2'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-includes/js/jquery/jquery-migrate.min.js?ver=1.2.1'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/plugins/LayerSlider/static/js/layerslider.kreaturamedia.jquery.js?ver=5.3.0'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/plugins/LayerSlider/static/js/layerslider.transitions.js?ver=5.3.0'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/plugins/revslider/rs-plugin/js/jquery.themepunch.tools.min.js?rev=4.6.0&#038;ver=4.2.2'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/plugins/revslider/rs-plugin/js/jquery.themepunch.revolution.min.js?rev=4.6.0&#038;ver=4.2.2'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/plugins/wpomc-mv-referrer-tools/resources/js/spin.min.js?ver=4.2.2'></script>\n" +
                "<script type='text/javascript'>\n" +
                "/* <![CDATA[ */\n" +
                "var omcmvrefobject = {\"omcmvajaxurl\":\"http:\\/\\/hopebar.com\\/wp-admin\\/admin-ajax.php\",\"omcmvajaxnonce\":\"e80c635998\",\"omcmvreloadpage\":\"http:\\/\\/hopebar.com\\/nourish-two\\/\"};\n" +
                "/* ]]> */\n" +
                "</script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/plugins/wpomc-mv-referrer-tools/resources/js/omc-mv-ref-tools-plugin.js?ver=4.2.2'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/plugins/Ultimate_VC_Addons/assets/min-js/ultimate.min.js?ver=3.11.1'></script>\n" +
                "<link rel=\"EditURI\" type=\"application/rsd+xml\" title=\"RSD\" href=\"http://hopebar.com/xmlrpc.php?rsd\" />\n" +
                "<link rel=\"wlwmanifest\" type=\"application/wlwmanifest+xml\" href=\"http://hopebar.com/wp-includes/wlwmanifest.xml\" /> \n" +
                "<meta name=\"generator\" content=\"WordPress 4.2.2\" />\n" +
                "<meta name=\"generator\" content=\"WooCommerce 2.3.8\" />\n" +
                "<link rel='canonical' href='http://hopebar.com/nourish-two/' />\n" +
                "<link rel='shortlink' href='http://hopebar.com/?p=20' />\n" +
                "<style type=\"text/css\">\n" +
                "#title-wrapper { background: url('http://hopebar.diemergroup.com/wp-content/uploads/2015/02/header-nourish-two.png') no-repeat top center scroll; }\n" +
                ".title-holder{ padding-top: 80px; }\n" +
                ".title-holder{ height: 320px; }\n" +
                "</style>\n" +
                "\t<style type=\"text/css\">.recentcomments a{display:inline !important;padding:0 !important;margin:0 !important;}</style>\n" +
                "<meta name=\"generator\" content=\"Powered by Visual Composer - drag and drop page builder for WordPress.\"/>\n" +
                "<!--[if IE 8]><link rel=\"stylesheet\" type=\"text/css\" href=\"http://hopebar.com/wp-content/plugins/js_composer/assets/css/vc-ie8.css\" media=\"screen\"><![endif]--><style type=\"text/css\" data-type=\"vc_shortcodes-custom-css\">.vc_custom_1427414487861{padding-top: 60px !important;}.vc_custom_1424468662526{padding-top: 50px !important;padding-bottom: 50px !important;background-color: #74bd4c !important;}.vc_custom_1424464028398{margin-bottom: 0px !important;}.vc_custom_1424463807538{padding-bottom: 40px !important;}.vc_custom_1424472894219{padding: 60px !important;background: #545454 url(http://hopebar.diemergroup.com/wp-content/uploads/2015/02/bg-girls.jpg?id=221) !important;background-position: center !important;background-repeat: no-repeat !important;background-size: cover !important;}.vc_custom_1424471636633{padding-top: 40px !important;}.vc_custom_1424473015903{margin-top: 0px !important;margin-bottom: 0px !important;}.vc_custom_1424473050339{margin-top: 0px !important;margin-bottom: 0px !important;}.vc_custom_1424468652964{padding-right: 5% !important;padding-left: 5% !important;}.vc_custom_1424468785079{padding-top: 20px !important;}.vc_custom_1424473069779{margin-top: 0px !important;margin-bottom: 0px !important;}.vc_custom_1424470847835{padding-right: 5% !important;padding-left: 5% !important;}.vc_custom_1424470835956{padding-right: 5% !important;padding-left: 5% !important;}.vc_custom_1424470916372{padding-right: 5% !important;padding-left: 5% !important;}.vc_custom_1424473088712{margin-top: 0px !important;margin-bottom: 0px !important;}.vc_custom_1427692301884{padding-top: 20px !important;padding-right: 5% !important;padding-left: 5% !important;}.vc_custom_1427725692737{padding-right: 5% !important;padding-left: 5% !important;}.vc_custom_1424473122474{margin-top: 0px !important;margin-bottom: 0px !important;}</style><noscript><style> .wpb_animate_when_almost_visible { opacity: 1; }</style></noscript> \t\n" +
                "</head>\n" +
                "\n" +
                "<body class=\"page page-id-20 page-template-default layout-wide header-horizontal header-style-h1 header-sticky title-parallax wpb-js-composer js-comp-ver-4.4.3 vc_responsive\">\n" +
                "\n" +
                "<div id=\"st-wrapper\">\n" +
                "  \n" +
                "  \t<div class=\"mv-top-toolbar login_top\"><ul id=\"\" class=\"mv-referrer-menu login list-inline pull-right hide\"><li class=\"dropdown hide\">\n" +
                "      <a class=\"referring-member-link\" data-omcmvpopref=\"mvReferrerMemberTrigger\" data-omcmvtrigger=\"mvReferrerModal\" data-target=\"#mvReferringMemberPop\" href=\"javascript:void(0);\">Referring Member</a><!-- Modal -->\n" +
                "      <div class=\"modal fade mvReferringMemberPop\" id=\"mvReferringMemberPop\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"referringMemberPopLabel\" aria-hidden=\"true\">\n" +
                "        <div class=\"modal-dialog\">\n" +
                "          <div class=\"modal-content\">\n" +
                "            <form role=\"form\" id=\"mvReferrerIdValidateForm\" action=\"javascript:void(0);\">\n" +
                "            <div class=\"modal-header\">\n" +
                "              <button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button>\n" +
                "              <h4 class=\"modal-title\" id=\"referringMemberPopLabel\">Purchase Code</h4>\n" +
                "            </div>\n" +
                "            <div class=\"modal-body\">\n" +
                "                <div class=\"form-group\">\n" +
                "                  <label for=\"recipient-name\" class=\"control-label\">Please enter your unique purchase code to continue:</label>\n" +
                "                  <input type=\"text\" class=\"form-control\" name=\"referring_id\" placeholder=\"Referrer ID\">\n" +
                "                </div>\n" +
                "              Don't have a referral code? Contact the person who shared the Hope Bar Project with you.\n" +
                "            </div>\n" +
                "            <div class=\"modal-footer\">\n" +
                "              <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n" +
                "              <button type=\"submit\" class=\"btn btn-warning validate-referring-id\">Submit</button>\n" +
                "              <em class=\"hide ref-err-msg-txt\">The purchase code you entered is invalid. Please check the ID and then try again.</em>\n" +
                "              <input type=\"hidden\" name=\"omcmvpopfireref\" value=\"\" />\n" +
                "              <input type=\"hidden\" name=\"omcmvpopred\" value=\"\" />\n" +
                "            </div>\n" +
                "          </form>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div></li><li class=\"menu-item menu-item-type-custom menu-item-object-custom\"><a data-target=\"#mvReferringMemberPop\" data-omcmvpopref=\"mvJoinNowTrigger\" data-omcmvtrigger=\"mvReferrerModal\" href=\"javascript:void(0);\">Buy Now</a></li></ul></div>  \n" +
                "<!-- header -->\n" +
                "<header id=\"header\" class=\"header-skin-light\">\n" +
                "    \t\n" +
                "\t\t\n" +
                "\t<div id=\"middle-wrapper\">\n" +
                "\t\n" +
                "\t\t<div class=\"container\">\n" +
                "\t\t<div class=\"row\">\n" +
                "\t\t\t\n" +
                "\t\t\t<div class=\"col-md-12 col-sm-12\">\n" +
                "\t\t\t\n" +
                "\t\t\t\t<div class=\"header-logo\">\n" +
                "\t\t\t\t\t<a class=\"st-logo\" href=\"http://hopebar.com/\" title=\"Hope Bar\">\n" +
                "\t\t\t\t<img class=\"logo-standart\" src=\"http://hopebar.com/wp-content/uploads/2015/04/hopebar-com-logo-new.png\" alt=\"Hope Bar\" />\n" +
                "\t\t\t\t<img class=\"logo-sticky\" src=\"http://hopebar.com/wp-content/uploads/2015/04/hopebar-com-logo-new.png\" alt=\"Hope Bar\" />\n" +
                "\t\t\t</a>\t\t\t\t</div>\n" +
                "\t\t\t\t<div class=\"header-logoSecondary\">\n" +
                "\t\t\t\t\t<a class=\"st-logoSecondary\" href=\"http://hopebar.com/\" title=\"Hope Bar\">\n" +
                "\t\t\t\t<img class=\"logo-standartSecondary\" src=\"http://hopebar.com/wp-content/uploads/2015/02/bont1.png\" alt=\"Hope Bar\" />\n" +
                "\t\t\t</a>\t\t\t\t</div>\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t<div class=\"middle-container\">\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t<nav id=\"primary-nav\">\n" +
                "\t\t\t\t\t\t<div class=\"menu-primary-container\"><ul id=\"primary-menu\" class=\"primary-menu list-inline\"><li id=\"menu-item-648\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-648\"><a href=\"http://hopebar.com/shop/\"><span>Shop</span></a></li>\n" +
                "<li id=\"menu-item-30\" class=\"menu-item menu-item-type-post_type menu-item-object-page current-menu-item page_item page-item-20 current_page_item current-menu-ancestor current-menu-parent current_page_parent current_page_ancestor menu-item-has-children menu-item-30\"><a href=\"http://hopebar.com/nourish-two/\"><span>Nourish Two?</span></a>\n" +
                "<ul class=\"sub-menu\">\n" +
                "\t<li id=\"menu-item-140\" class=\"menu-item menu-item-type-custom menu-item-object-custom current-menu-item menu-item-140\"><a href=\"/nourish-two/#how\">How It Works</a></li>\n" +
                "\t<li id=\"menu-item-141\" class=\"menu-item menu-item-type-custom menu-item-object-custom current-menu-item menu-item-141\"><a href=\"/nourish-two/#why\">Why We Give</a></li>\n" +
                "\t<li id=\"menu-item-142\" class=\"menu-item menu-item-type-custom menu-item-object-custom current-menu-item menu-item-142\"><a href=\"/nourish-two/#what\">What We Give</a></li>\n" +
                "\t<li id=\"menu-item-143\" class=\"menu-item menu-item-type-custom menu-item-object-custom current-menu-item menu-item-143\"><a href=\"/nourish-two/#diff\">Why We&#8217;re Different</a></li>\n" +
                "\t<li id=\"menu-item-144\" class=\"menu-item menu-item-type-custom menu-item-object-custom current-menu-item menu-item-144\"><a href=\"/nourish-two/#partners\">Our Giving Partners</a></li>\n" +
                "</ul>\n" +
                "</li>\n" +
                "<li id=\"menu-item-28\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-28\"><a href=\"http://hopebar.com/hope-whole-food-bar/\"><span>The Bar</span></a></li>\n" +
                "<li id=\"menu-item-711\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-711\"><a href=\"http://hopebar.com/reboot-food-plan/\"><span>Reboot Food Plan</span></a></li>\n" +
                "</ul></div>\t\t\t\t\t</nav>\n" +
                "\t\t\t\t\t<a id=\"toggle-mobile-menu\" class=\"toggle-menu\"><span></span></a>\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<div class=\"middle-inner\">\n" +
                "\t\t\t\t\t\t<div class=\"header-cart\"><div class=\"st-cart\">\n" +
                "\t\t\t\t<div class=\"cart-info\">\n" +
                "\t\t\t\t\t<i class=\"fa fa-shopping-cart\"></i><a class=\"cart_totals\" title=\"View your shopping cart\"><span class=\"amount\">&#36;0.00</span></a>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t\t<div class=\"woocommerce cart-products\">\n" +
                "\t\t\t\t\t<div class=\"widget_shopping_cart_content\"></div>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</div></div><div class=\"header-search\"><div class=\"st-searchform\">\n" +
                "\t\t\t\t<div class=\"search-form\" style=\"display: none\">\n" +
                "\t\t\t\t\t<form action=\"http://hopebar.com/\" method=\"get\">\n" +
                "\t\t\t\t\t\t<input type=\"text\" name=\"s\" id=\"s\" placeholder=\"Search...\" />\n" +
                "\t\t\t\t\t</form>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</div><div class=\"search-icon\"><i class=\"fa fa-search\"></i></div></div>\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t\t\n" +
                "\t\t\t</div>\n" +
                "\t\t\n" +
                "\t\t</div>\n" +
                "\t\t</div>\n" +
                "\t\n" +
                "\t</div>\n" +
                "\n" +
                "</header>\n" +
                "<!-- end header --><section id=\"title-wrapper\">\n" +
                "\n" +
                "\t\t\n" +
                "\t<div class=\"container\">\n" +
                "\t<div class=\"row\">\n" +
                "\t\t\n" +
                "\t\t<div class=\"col-md-12\">\n" +
                "\t\t\n" +
                "\t\t\t<div class=\"title-holder\">\n" +
                "\t\t\t<div class=\"title-holder-table\">\n" +
                "\t\t\t<div class=\"title-holder-cell text-center\">\n" +
                "\t\t\t\n" +
                "\t\t\t<h1 class=\"page-title\"><span>Buy One, Nourish Two.</span></h1><span class=\"page-subtitle\">The Hope Bar was designed to provide <strong>BOTH</strong> the consumer <strong>AND</strong> the children we nourish with the exact same standardized whole food nutritional support.</span>\t\t\t\n" +
                "\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\t\t\t\t\n" +
                "\t\t</div>\n" +
                "\t\n" +
                "\t</div>\n" +
                "\t</div>\n" +
                "\n" +
                "</section><!-- main-container -->\n" +
                "<section id=\"main-wrapper\" class=\"is-vc\" role=\"main\">\n" +
                "\n" +
                "\t<!-- post entry -->\n" +
                "<article id=\"post-20\" class=\"page-single clearfix post-20 page type-page status-publish hentry\">\n" +
                "\t\n" +
                "\t\t\n" +
                "\t<div class=\"post-content\">\n" +
                "\t\t<div class=\"wpb_row wpb_section wpb_padding vc_row-fluid vc_custom_1427414487861\"><div class=\"container\"><div class=\"row\">\n" +
                "\t<div class=\"vc_col-sm-12 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<div style=\"min-height: 0px;\"></div>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t<div class=\"wpb_text_column wpb_content_element  vc_custom_1424473015903\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<div id=\"how\"></div>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> <h3 class=\"st-heading style-2 text-center\"><span>How It Works</span></h3><div class=\"wpb_row wpb_section wpb_padding vc_row-fluid\"><div class=\"container\"><div class=\"row\">\n" +
                "\t<div class=\"vc_col-sm-4 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_single_image wpb_content_element vc_align_center\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t\t<div class=\"vc_single_image-wrapper   vc_box_border_grey\"><img class=\"vc_single_image-img \" src=\"http://hopebar.com/wp-content/uploads/2015/02/iStock_000035227124_Medium-300x300.jpg\" width=\"300\" height=\"300\" alt=\"vitruvian man - vascular system\" title=\"vitruvian man - vascular system\" /></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<h3 style=\"text-align: center;\">You Need</h3>\n" +
                "<p style=\"text-align: center;\">Your body is designed to crave food until it is properly nourished. But in our modern diets we seldom meet those needs, so the cravings never stop. It&#8217;s called the obesity paradox: over-fed but undernourished.</p>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\n" +
                "\t<div class=\"vc_col-sm-4 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_single_image wpb_content_element vc_align_center\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t\t<div class=\"vc_single_image-wrapper   vc_box_border_grey\"><img class=\"vc_single_image-img \" src=\"http://hopebar.com/wp-content/uploads/2015/02/JMR_1650-515x400.jpg\" width=\"515\" height=\"400\" alt=\"JMR_1650\" title=\"JMR_1650\" /></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<div style=\"min-height: 10px;\"></div>\n" +
                "<h3 style=\"text-align: center;\">We Provide</h3>\n" +
                "<p style=\"text-align: center;\">The Hope Bar is the first food bar packed with whole food-sourced vitamins, minerals, and advanced immune support to help fill those nutritional gaps.<br />\n" +
                "<strong>No Synthetics • Non GMO • Gluten Free.</strong></p>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\n" +
                "\t<div class=\"vc_col-sm-4 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_single_image wpb_content_element vc_align_center\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t\t<div class=\"vc_single_image-wrapper   vc_box_border_grey\"><img width=\"254\" height=\"300\" src=\"http://hopebar.com/wp-content/uploads/2015/02/IMG_0860-2-mod-254x300.jpg\" class=\"vc_single_image-img attachment-medium\" alt=\"IMG_0860 (2) mod\" /></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<h3 style=\"text-align: center;\">They Receive</h3>\n" +
                "<p style=\"text-align: center;\">Your decision to nourish yourself with the Hope Bar allows us to send the same whole food nutritional support to children in need in the United States and throughout the world.</p>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "</div></div></div>\n" +
                "\t<div class=\"wpb_text_column wpb_content_element  vc_custom_1424473050339\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<div id=\"why\"></div>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "</div></div></div><!-- Row Backgrounds --><div class=\"upb_no_bg\" data-fadeout=\"\" data-fadeout-percentage=\"30\" data-parallax-content=\"\" data-parallax-content-sense=\"30\" data-row-effect-mobile-disable=\"true\" data-img-parallax-mobile-disable=\"true\" data-rtl=\"false\"  data-custom-vc-row=\"\"  data-vc=\"4.4.3\"  data-theme-support=\"\"    ></div><div class=\"wpb_row wpb_section wpb_padding vc_row-fluid vc_custom_1424468662526\"><div class=\"container\"><div class=\"row\">\n" +
                "\t<div class=\"vc_col-sm-6 wpb_column column_container vc_custom_1424468652964\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_text_column wpb_content_element  vc_custom_1424468785079\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<h3 class=\"st-heading style-1 text-left\"><span style=\"color: #ffffff;\">Why We Give</span></h3>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<h3><span style=\"color: #ffffff;\"><em><strong>When children are malnourished, their development is compromised. This often results in stunted growth, diminished brain and cognitive functions and a weakened immune system, so they are more susceptible to chronic infections and disease.</strong></em></span></h3>\n" +
                "<p><span style=\"color: #ffffff;\"><br />\n" +
                "Malnutrition is the condition that develops when the body does not get the right amount of the vitamins, minerals, and other nutrients it needs to maintain healthy tissues and organ function.</span></p>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\n" +
                "\t<div class=\"vc_col-sm-6 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_single_image wpb_content_element vc_align_center\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t\t<div class=\"vc_single_image-wrapper vc_box_rounded  vc_box_border_grey\"><img class=\"vc_single_image-img \" src=\"http://hopebar.com/wp-content/uploads/2015/02/pic-girl-450x450.png\" width=\"450\" height=\"450\" alt=\"pic-girl\" title=\"pic-girl\" /></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "</div></div></div><!-- Row Backgrounds --><div class=\"upb_no_bg\" data-fadeout=\"\" data-fadeout-percentage=\"30\" data-parallax-content=\"\" data-parallax-content-sense=\"30\" data-row-effect-mobile-disable=\"true\" data-img-parallax-mobile-disable=\"true\" data-rtl=\"false\"  data-custom-vc-row=\"\"  data-vc=\"4.4.3\"  data-theme-support=\"\"    ></div><div class=\"wpb_row wpb_section wpb_padding vc_row-fluid vc_custom_1424464028398\"><div class=\"container\"><div class=\"row\">\n" +
                "\t<div class=\"vc_col-sm-12 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_text_column wpb_content_element  vc_custom_1424473069779\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<div id=\"what\"></div>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> <h3 class=\"st-heading style-1 text-center\"><span>What We Give</span></h3>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "</div></div></div><!-- Row Backgrounds --><div class=\"upb_no_bg\" data-fadeout=\"\" data-fadeout-percentage=\"30\" data-parallax-content=\"\" data-parallax-content-sense=\"30\" data-row-effect-mobile-disable=\"true\" data-img-parallax-mobile-disable=\"true\" data-rtl=\"false\"  data-custom-vc-row=\"\"  data-vc=\"4.4.3\"  data-theme-support=\"\"    ></div><div class=\"wpb_row wpb_section wpb_padding vc_row-fluid vc_custom_1424463807538\"><div class=\"container\"><div class=\"row\">\n" +
                "\t<div class=\"vc_col-sm-6 wpb_column column_container vc_custom_1424470847835\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_single_image wpb_content_element vc_align_center\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t\t<div class=\"vc_single_image-wrapper   vc_box_border_grey\"><img width=\"300\" height=\"283\" src=\"http://hopebar.com/wp-content/uploads/2015/02/DSC5565-300x283.jpg\" class=\"vc_single_image-img attachment-medium\" alt=\"_DSC5565\" /></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<h2 style=\"text-align: center;\">Hope Blend</h2>\n" +
                "<p>Hope Blend provides 100% of the micronutrient vitamins and minerals and <strong>advanced immune support</strong> from whole food sources that a child needs for an entire day; Putting Hope Blend into a child&#8217;s food turns whatever they eat into the most nourishing thing they will ever eat.</p>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\n" +
                "\t<div class=\"vc_col-sm-6 wpb_column column_container vc_custom_1424470835956\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_single_image wpb_content_element vc_align_center\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t\t<div class=\"vc_single_image-wrapper   vc_box_border_grey\"><img width=\"450\" height=\"259\" src=\"http://hopebar.com/wp-content/uploads/2015/02/hope-bars.png\" class=\"vc_single_image-img attachment-full\" alt=\"hope-bars\" /></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<h2 style=\"text-align: center;\">Hope Bar</h2>\n" +
                "<p>The Hope Bar is sometimes used as a delivery system for Hope Blend where feeding programs do not exist.</p>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "</div></div></div><!-- Row Backgrounds --><div class=\"upb_no_bg\" data-fadeout=\"\" data-fadeout-percentage=\"30\" data-parallax-content=\"\" data-parallax-content-sense=\"30\" data-row-effect-mobile-disable=\"true\" data-img-parallax-mobile-disable=\"true\" data-rtl=\"false\"  data-custom-vc-row=\"\"  data-vc=\"4.4.3\"  data-theme-support=\"\"    ></div><div class=\"wpb_row wpb_section wpb_padding vc_row-fluid vc_custom_1424472894219\"><div class=\"container\"><div class=\"row\">\n" +
                "\t<div class=\"vc_col-sm-12 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<div class=\"wpb_row wpb_section wpb_padding vc_row-fluid\"><div class=\"container\"><div class=\"row\">\n" +
                "\t<div class=\"vc_col-sm-12 wpb_column column_container vc_custom_1424470916372\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_text_column wpb_content_element  vc_custom_1424473088712\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<div id=\"diff\"></div>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t<div class=\"wpb_text_column wpb_content_element  vc_custom_1427692301884\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<h3 class=\"st-heading style-1 text-left\" style=\"text-align: center;\"><span style=\"color: #ffffff;\">Why We&#8217;re Different</span></h3>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t<div class=\"wpb_text_column wpb_content_element  vc_custom_1427725692737\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<p><span style=\"color: #ffffff; font-size: 16px;\"><br />\n" +
                "The Hope Bar Project was designed to provide <strong>BOTH</strong> the consumer <strong>AND</strong> the children we nourish with the exact same standardized whole food nutritional support. New Social businesses have come into the market over the last few years that are connecting the sale of their food products (typically snack bars) to the donation of a fortified food packet to bring relief to an undernourished child somewhere in the world. While this is a noble effort, it falls short in two important areas. First, in today&#8217;s world, both the consumer as well as the child have a critical need for good nutrition. And second, the human body was designed to utilize nutrients from food, not from synthetically made vitamins and minerals. Thats why our Project offers real &#8220;Hope&#8221; to everyone involved. </span></p>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "</div></div></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "</div></div></div><!-- Row Backgrounds --><div class=\"upb_no_bg\" data-fadeout=\"\" data-fadeout-percentage=\"30\" data-parallax-content=\"\" data-parallax-content-sense=\"30\" data-row-effect-mobile-disable=\"true\" data-img-parallax-mobile-disable=\"true\" data-rtl=\"false\"  data-custom-vc-row=\"\"  data-vc=\"4.4.3\"  data-theme-support=\"\"    ></div><div class=\"wpb_row wpb_section wpb_padding vc_row-fluid vc_custom_1424471636633\"><div class=\"container\"><div class=\"row\">\n" +
                "\t<div class=\"vc_col-sm-12 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_text_column wpb_content_element  vc_custom_1424473122474\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<div id=\"partners\"></div>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> <h3 class=\"st-heading style-2 text-center\"><span>Our Giving Partners</span></h3><div class=\"wpb_row wpb_section wpb_padding vc_row-fluid\"><div class=\"container\"><div class=\"row\">\n" +
                "\t<div class=\"vc_col-sm-3 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_single_image wpb_content_element vc_align_center\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t\t<a href=\"http://mannarelief.org/\" target=\"_blank\"><div class=\"vc_single_image-wrapper   vc_box_border_grey\"><img class=\"vc_single_image-img \" src=\"http://hopebar.com/wp-content/uploads/2015/02/mannarelief-logo.png\" width=\"200\" height=\"200\" alt=\"mannarelief-logo\" title=\"mannarelief-logo\" /></div></a>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<p style=\"text-align: center;\">MannaRelief</p>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\n" +
                "\t<div class=\"vc_col-sm-3 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_single_image wpb_content_element vc_align_center\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t\t<div class=\"vc_single_image-wrapper   vc_box_border_grey\"><img class=\"vc_single_image-img \" src=\"http://hopebar.com/wp-content/uploads/2015/02/coh-logo.png\" width=\"200\" height=\"200\" alt=\"coh-logo\" title=\"coh-logo\" /></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<p style=\"text-align: center;\">Convoy of Hope</p>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\n" +
                "\t<div class=\"vc_col-sm-3 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_single_image wpb_content_element vc_align_center\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t\t<div class=\"vc_single_image-wrapper   vc_box_border_grey\"><img class=\"vc_single_image-img \" src=\"http://hopebar.com/wp-content/uploads/2015/02/vamos-logo.png\" width=\"200\" height=\"200\" alt=\"vamos-logo\" title=\"vamos-logo\" /></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<p style=\"text-align: center;\">Vamos Mexico</p>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\n" +
                "\t<div class=\"vc_col-sm-3 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_single_image wpb_content_element vc_align_left\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t\t<div class=\"vc_single_image-wrapper   vc_box_border_grey\"><img class=\"vc_single_image-img \" src=\"http://hopebar.com/wp-content/uploads/2015/02/logo-childrens-hunger-fund.png\" width=\"200\" height=\"200\" alt=\"logo-childrens-hunger-fund\" title=\"logo-childrens-hunger-fund\" /></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<p style=\"text-align: center;\">Children&#8217;s Hunger Fund</p>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "</div></div></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "</div></div></div><!-- Row Backgrounds --><div class=\"upb_no_bg\" data-fadeout=\"\" data-fadeout-percentage=\"30\" data-parallax-content=\"\" data-parallax-content-sense=\"30\" data-row-effect-mobile-disable=\"true\" data-img-parallax-mobile-disable=\"true\" data-rtl=\"false\"  data-custom-vc-row=\"\"  data-vc=\"4.4.3\"  data-theme-support=\"\"    ></div>\n" +
                "\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\n" +
                "\t</div>\n" +
                "\n" +
                "</article>\n" +
                "<!-- end post entry -->\t\t\n" +
                "\n" +
                "</section>\n" +
                "<!-- end main-container -->\t<!-- footer -->\n" +
                "\t<footer id=\"footer\">\n" +
                "\t\t\n" +
                "\t\t\t\t<div id=\"footer-wrapper\">\n" +
                "\t\t\n" +
                "\t\t\t<div class=\"container\">\n" +
                "\t\t\t<div class=\"row\">\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t<div class=\"col-md-4\"><section id=\"nav_menu-2\" class=\"widget widget_nav_menu\"><div class=\"menu-footer-container\"><ul id=\"menu-footer\" class=\"menu\"><li id=\"menu-item-494\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-494\"><a href=\"http://hopebar.com/hope-whole-food-bar/\">The Hope Bar</a></li>\n" +
                "<li id=\"menu-item-496\" class=\"menu-item menu-item-type-post_type menu-item-object-page current-menu-item page_item page-item-20 current_page_item menu-item-496\"><a href=\"http://hopebar.com/nourish-two/\">Buy One Nourish Two?</a></li>\n" +
                "<li id=\"menu-item-602\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-602\"><a href=\"http://hopebar.com/shop/\">Shop</a></li>\n" +
                "<li class=\"wpmenucartli wpmenucart-display-standard menu-item menu-item-type-post_type menu-item-object-page\" id=\"wpmenucartli\"><a class=\"wpmenucart-contents empty-wpmenucart-visible\" href=\"http://hopebar.com/shop/\" title=\"Start shopping\"><i class=\"wpmenucart-icon-shopping-cart-0\"></i><span class=\"cartcontents\">0 items</span><span class=\"amount\">&#36;0.00</span></a></li></ul></div></section></div><div class=\"col-md-4\"></div><div class=\"col-md-4\"><section id=\"text-2\" class=\"widget widget_text\">\t\t\t<div class=\"textwidget\"><div style=\"text-align: center\"><a href=\"http://hopebar.com/terms-of-service\">Terms of Service</a><br />\n" +
                "<a href=\"mailto:support@hopebar.com\">Support@hopebar.com</a><br />\n" +
                "</div>\n" +
                "</div>\n" +
                "\t\t</section></div>\t\t\t\t\n" +
                "\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\t\t\n" +
                "\t\t</div>\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t<div id=\"copyright-wrapper\">\n" +
                "\t\t\t\t\n" +
                "\t\t\t<div class=\"container\">\n" +
                "\t\t\t<div class=\"row\">\n" +
                "\t\t\t\n" +
                "\t\t\t\t<div class=\"col-md-12 col-sm-12 col-xs-12 text-center\">\n" +
                "\t\t\t\t\t<div>© 2015 HopeBar.com. All rights reserved.</div>\t\t\t\t\t\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\t\t\t\n" +
                "\t\t</div>\n" +
                "\t\t\t\t\n" +
                "\t</footer>\n" +
                "\t<!-- end footer -->\n" +
                "\t\n" +
                "</div>\n" +
                "<!-- end .wrap -->\n" +
                "\n" +
                "<div class=\"scrollTop\"><a href=\"#\"><i class=\"fa fa-chevron-up\"></i></a></div>\n" +
                "\n" +
                "<script>\n" +
                "  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n" +
                "  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n" +
                "  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n" +
                "  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');\n" +
                "\n" +
                "  ga('create', 'UA-58501412-1', 'auto');\n" +
                "  ga('send', 'pageview');\n" +
                "\n" +
                "</script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/plugins/contact-form-7/includes/js/jquery.form.min.js?ver=3.51.0-2014.06.20'></script>\n" +
                "<script type='text/javascript'>\n" +
                "/* <![CDATA[ */\n" +
                "var _wpcf7 = {\"loaderUrl\":\"http:\\/\\/hopebar.com\\/wp-content\\/plugins\\/contact-form-7\\/images\\/ajax-loader.gif\",\"sending\":\"Sending ...\"};\n" +
                "/* ]]> */\n" +
                "</script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/plugins/contact-form-7/includes/js/scripts.js?ver=4.1.2'></script>\n" +
                "<script type='text/javascript'>\n" +
                "/* <![CDATA[ */\n" +
                "var wc_add_to_cart_params = {\"ajax_url\":\"\\/wp-admin\\/admin-ajax.php\",\"i18n_view_cart\":\"View Cart\",\"cart_url\":\"http:\\/\\/hopebar.com\\/cart\\/\",\"is_cart\":\"\",\"cart_redirect_after_add\":\"no\"};\n" +
                "/* ]]> */\n" +
                "</script>\n" +
                "<script type='text/javascript' src='//hopebar.com/wp-content/plugins/woocommerce/assets/js/frontend/add-to-cart.min.js?ver=2.3.8'></script>\n" +
                "<script type='text/javascript' src='//hopebar.com/wp-content/plugins/woocommerce/assets/js/jquery-blockui/jquery.blockUI.min.js?ver=2.60'></script>\n" +
                "<script type='text/javascript'>\n" +
                "/* <![CDATA[ */\n" +
                "var woocommerce_params = {\"ajax_url\":\"\\/wp-admin\\/admin-ajax.php\"};\n" +
                "/* ]]> */\n" +
                "</script>\n" +
                "<script type='text/javascript' src='//hopebar.com/wp-content/plugins/woocommerce/assets/js/frontend/woocommerce.min.js?ver=2.3.8'></script>\n" +
                "<script type='text/javascript' src='//hopebar.com/wp-content/plugins/woocommerce/assets/js/jquery-cookie/jquery.cookie.min.js?ver=1.4.1'></script>\n" +
                "<script type='text/javascript'>\n" +
                "/* <![CDATA[ */\n" +
                "var wc_cart_fragments_params = {\"ajax_url\":\"\\/wp-admin\\/admin-ajax.php\",\"fragment_name\":\"wc_fragments\"};\n" +
                "/* ]]> */\n" +
                "</script>\n" +
                "<script type='text/javascript' src='//hopebar.com/wp-content/plugins/woocommerce/assets/js/frontend/cart-fragments.min.js?ver=2.3.8'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/themes/keisus/js/bootstrap.min.js?ver=2.3.1'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/themes/keisus/js/jquery.easing.js?ver=1.3'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/themes/keisus/js/jquery.fitvids.js?ver=1.0'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/themes/keisus/js/jquery.viewport.mini.js?ver=1.0'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/themes/keisus/js/jquery.isotope.min.js?ver=2.0.1'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/themes/keisus/js/jquery.nicescroll.min.js?ver=3.2.0'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/themes/keisus/js/jquery.waypoints.min.js?ver=2.0.5'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/themes/keisus/js/jquery.easypiechart.min.js?ver=2.1.5'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/themes/keisus/js/jquery.owl.carousel.min.js?ver=1.3.3'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/themes/keisus/js/jquery.countdown.min.js?ver=2.0.1'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/themes/keisus/js/jquery.parallax.js?ver=1.1.3'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/themes/keisus/js/mediaelement-and-player.min.js?ver=2.15.1'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/themes/keisus/js/prettyPhoto/jquery.prettyPhoto.js?ver=3.1.5'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-includes/js/comment-reply.min.js?ver=4.2.2'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/themes/keisus/js/scripts.js?ver=1.0'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/plugins/js_composer/assets/js/js_composer_front.js?ver=4.4.3'></script>\n" +
                "</body>\n" +
                "</html>";
        webview.loadData(summary, "text/html", null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
