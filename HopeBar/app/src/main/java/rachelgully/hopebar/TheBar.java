package rachelgully.hopebar;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class TheBar extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_the_bar);

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
                "\t<title>The Hope Bar | Hope Bar</title>\n" +
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
                "<link rel=\"alternate\" type=\"application/rss+xml\" title=\"Hope Bar &raquo; The Hope Bar Comments Feed\" href=\"http://hopebar.com/hope-whole-food-bar/feed/\" />\n" +
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
                "<link rel='stylesheet' id='st-skin-custom-css'  href='http://hopebar.com/wp-content/themes/keisus/css/custom.php?st_id=26&#038;ver=1.2' type='text/css' media='all' />\n" +
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
                "var omcmvrefobject = {\"omcmvajaxurl\":\"http:\\/\\/hopebar.com\\/wp-admin\\/admin-ajax.php\",\"omcmvajaxnonce\":\"e80c635998\",\"omcmvreloadpage\":\"http:\\/\\/hopebar.com\\/hope-whole-food-bar\\/\"};\n" +
                "/* ]]> */\n" +
                "</script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/plugins/wpomc-mv-referrer-tools/resources/js/omc-mv-ref-tools-plugin.js?ver=4.2.2'></script>\n" +
                "<script type='text/javascript' src='http://hopebar.com/wp-content/plugins/Ultimate_VC_Addons/assets/min-js/ultimate.min.js?ver=3.11.1'></script>\n" +
                "<link rel=\"EditURI\" type=\"application/rsd+xml\" title=\"RSD\" href=\"http://hopebar.com/xmlrpc.php?rsd\" />\n" +
                "<link rel=\"wlwmanifest\" type=\"application/wlwmanifest+xml\" href=\"http://hopebar.com/wp-includes/wlwmanifest.xml\" /> \n" +
                "<meta name=\"generator\" content=\"WordPress 4.2.2\" />\n" +
                "<meta name=\"generator\" content=\"WooCommerce 2.3.8\" />\n" +
                "<link rel='canonical' href='http://hopebar.com/hope-whole-food-bar/' />\n" +
                "<link rel='shortlink' href='http://hopebar.com/?p=26' />\n" +
                "<style type=\"text/css\">\n" +
                "#title-wrapper { background: url('http://hopebar.com/wp-content/uploads/2015/02/DSC5612.jpg') no-repeat center center scroll; }\n" +
                ".title-holder{ padding-top: 80px; }\n" +
                ".title-holder{ height: 320px; }\n" +
                "</style>\n" +
                "\t<style type=\"text/css\">.recentcomments a{display:inline !important;padding:0 !important;margin:0 !important;}</style>\n" +
                "<meta name=\"generator\" content=\"Powered by Visual Composer - drag and drop page builder for WordPress.\"/>\n" +
                "<!--[if IE 8]><link rel=\"stylesheet\" type=\"text/css\" href=\"http://hopebar.com/wp-content/plugins/js_composer/assets/css/vc-ie8.css\" media=\"screen\"><![endif]--><style type=\"text/css\" data-type=\"vc_shortcodes-custom-css\">.vc_custom_1427431750847{background-position: 0 0 !important;background-repeat: no-repeat !important;}.vc_custom_1424480394299{margin-bottom: 10px !important;}.vc_custom_1424480608219{padding-top: 30px !important;}.vc_custom_1424478437511{padding-top: 40px !important;padding-right: 5% !important;padding-left: 5% !important;}.vc_custom_1427430581543{margin-top: 10px !important;}.vc_custom_1424476577036{margin-bottom: 15px !important;}.vc_custom_1424476582824{margin-bottom: 15px !important;}.vc_custom_1424476598493{margin-bottom: 15px !important;}.vc_custom_1426737620546{margin-bottom: 15px !important;}.vc_custom_1427666848622{margin-right: -25px !important;margin-left: 15px !important;padding-top: 40px !important;padding-bottom: 40px !important;background-position: 0 0 !important;background-repeat: no-repeat !important;}.vc_custom_1427431843621{padding-top: 60px !important;}</style><noscript><style> .wpb_animate_when_almost_visible { opacity: 1; }</style></noscript> \t\n" +
                "</head>\n" +
                "\n" +
                "<body class=\"page page-id-26 page-template-default layout-wide header-horizontal header-style-h1 header-sticky title-parallax wpb-js-composer js-comp-ver-4.4.3 vc_responsive\">\n" +
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
                "<li id=\"menu-item-30\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-30\"><a href=\"http://hopebar.com/nourish-two/\"><span>Nourish Two?</span></a>\n" +
                "<ul class=\"sub-menu\">\n" +
                "\t<li id=\"menu-item-140\" class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-140\"><a href=\"/nourish-two/#how\">How It Works</a></li>\n" +
                "\t<li id=\"menu-item-141\" class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-141\"><a href=\"/nourish-two/#why\">Why We Give</a></li>\n" +
                "\t<li id=\"menu-item-142\" class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-142\"><a href=\"/nourish-two/#what\">What We Give</a></li>\n" +
                "\t<li id=\"menu-item-143\" class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-143\"><a href=\"/nourish-two/#diff\">Why We&#8217;re Different</a></li>\n" +
                "\t<li id=\"menu-item-144\" class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-144\"><a href=\"/nourish-two/#partners\">Our Giving Partners</a></li>\n" +
                "</ul>\n" +
                "</li>\n" +
                "<li id=\"menu-item-28\" class=\"menu-item menu-item-type-post_type menu-item-object-page current-menu-item page_item page-item-26 current_page_item menu-item-28\"><a href=\"http://hopebar.com/hope-whole-food-bar/\"><span>The Bar</span></a></li>\n" +
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
                "\t\t\t<h1 class=\"page-title\"><span>Fall in Love with our Bars</span></h1><span class=\"page-subtitle\">made of whole food ingredients enriched with food-sourced vitamins, minerals, proteins and fats</span>\t\t\t\n" +
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
                "<article id=\"post-26\" class=\"page-single clearfix post-26 page type-page status-publish hentry\">\n" +
                "\t\n" +
                "\t\t\n" +
                "\t<div class=\"post-content\">\n" +
                "\t\t<div class=\"wpb_row wpb_section wpb_padding vc_row-fluid\"><div class=\"container\"><div class=\"row\">\n" +
                "\t<div class=\"vc_col-sm-12 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<div class=\"wpb_row wpb_section wpb_padding vc_row-fluid vc_custom_1424480394299\"><div class=\"container\"><div class=\"row\">\n" +
                "\t<div class=\"vc_col-sm-6 wpb_column column_container vc_custom_1424478437511\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<h3 style=\"text-align: center;\">How it&#8217;s Made</h3>\n" +
                "<p>The Hope Bar is a scientifically advanced  whole-food product on the market. Each Hope Bar is made from nutrient rich whole-food ingredients and then enriched with <strong>Hope Blend</strong>, a proprietary complex of standardized levels of food-sourced vitamins, minerals, and immune supporting nutrients.</p>\n" +
                "<p>These whole-food ingredients are then blended into a non-processed brown rice syrup that has one quarter of the glycemic index of table sugar and less than one-half that of honey. <strong>No sugar alcohols or artificial sweeteners are used in the bar. </strong></p>\n" +
                "<p>To top off its rich flavor, each Hope Bar is loaded with high anti-oxidant dark chocolate from the world famous GUITTARD CHOCOLATE COMPANY.</p>\n" +
                "<p>Each Hope Bar provides one-third of an adult&#8217;s total daily micronutrient vitamin and mineral requirements, making it the most nutritionally dense low-glycemic food product available.</p>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\n" +
                "\t<div class=\"vc_col-sm-6 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<div class=\"vc_empty_space\"  style=\"height: 32px\" ><span class=\"vc_empty_space_inner\"></span></div>\n" +
                "\n" +
                "\n" +
                "\t<div class=\"wpb_single_image wpb_content_element vc_custom_1427430581543 vc_align_left\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t\t<div class=\"vc_single_image-wrapper   vc_box_border_grey\"><img width=\"960\" height=\"640\" src=\"http://hopebar.com/wp-content/uploads/2015/02/JMR_1605-1024x683.jpg\" class=\"vc_single_image-img attachment-large\" alt=\"JMR_1605\" /></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "</div></div></div><div class=\"wpb_row wpb_section wpb_padding vc_row-fluid vc_custom_1424480608219\"><div class=\"container\"><div class=\"row\">\n" +
                "\t<div class=\"vc_col-sm-2 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\n" +
                "\t<div class=\"vc_col-sm-2 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_single_image wpb_content_element vc_custom_1424476577036 vc_align_center\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t\t<div class=\"vc_single_image-wrapper   vc_box_border_grey\"><img class=\"vc_single_image-img \" src=\"http://hopebar.com/wp-content/uploads/2015/02/icon-gluten-75x75.png\" width=\"75\" height=\"75\" alt=\"icon-gluten\" title=\"icon-gluten\" /></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<h5 style=\"text-align: center; margin-top: 0;\">GLUTEN FREE</h5>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\n" +
                "\t<div class=\"vc_col-sm-2 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_single_image wpb_content_element vc_custom_1424476582824 vc_align_center\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t\t<div class=\"vc_single_image-wrapper   vc_box_border_grey\"><img class=\"vc_single_image-img \" src=\"http://hopebar.com/wp-content/uploads/2015/02/icon-gmo-75x75.png\" width=\"75\" height=\"75\" alt=\"icon-gmo\" title=\"icon-gmo\" /></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<h5 style=\"text-align: center; margin-top: 0;\">NON GMO</h5>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\n" +
                "\t<div class=\"vc_col-sm-2 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_single_image wpb_content_element vc_custom_1424476598493 vc_align_center\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t\t<div class=\"vc_single_image-wrapper   vc_box_border_grey\"><img class=\"vc_single_image-img \" src=\"http://hopebar.com/wp-content/uploads/2015/02/icon-rock-75x75.png\" width=\"75\" height=\"75\" alt=\"icon-rock\" title=\"icon-rock\" /></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<h5 style=\"text-align: center; margin-top: 0;\">NO SYNTHETICS</h5>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\n" +
                "\t<div class=\"vc_col-sm-2 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_single_image wpb_content_element vc_custom_1426737620546 vc_align_center\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t\t<div class=\"vc_single_image-wrapper   vc_box_border_grey\"><img class=\"vc_single_image-img \" src=\"http://hopebar.com/wp-content/uploads/2015/02/icon-soy-75x75.png\" width=\"75\" height=\"75\" alt=\"icon-soy\" title=\"icon-soy\" /></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<h5 style=\"text-align: center; margin-top: 0;\">SOY FREE</h5>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\n" +
                "\t<div class=\"vc_col-sm-2 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "</div></div></div><div class=\"wpb_row wpb_section wpb_padding vc_row-fluid\"><div class=\"container\"><div class=\"row\">\n" +
                "\t<div class=\"vc_col-sm-3 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\n" +
                "\t<div class=\"vc_col-sm-6 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_single_image wpb_content_element vc_align_left\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t\t<div class=\"vc_single_image-wrapper   vc_box_border_grey\"><img width=\"1078\" height=\"574\" src=\"http://hopebar.com/wp-content/uploads/2015/02/Screen-Shot-2015-03-29-at-4.48.01-PM.png\" class=\"vc_single_image-img attachment-full\" alt=\"Screen Shot 2015-03-29 at 4.48.01 PM\" /></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\n" +
                "\t<div class=\"vc_col-sm-3 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "</div></div></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "</div></div></div><!-- Row Backgrounds --><div class=\"upb_no_bg\" data-fadeout=\"\" data-fadeout-percentage=\"30\" data-parallax-content=\"\" data-parallax-content-sense=\"30\" data-row-effect-mobile-disable=\"true\" data-img-parallax-mobile-disable=\"true\" data-rtl=\"false\"  data-custom-vc-row=\"\"  data-vc=\"4.4.3\"  data-theme-support=\"\"    ></div><div class=\"wpb_row wpb_section wpb_padding vc_row-fluid\"><div class=\"container\"><div class=\"row\">\n" +
                "\t<div class=\"vc_col-sm-12 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<h3 class=\"st-heading style-2 text-center\"><span>Formulated with Hope Blend</span></h3>\n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<h3 style=\"text-align: center;\">Hope Blend is a proprietary blend of the most advanced whole food vitamin, mineral and immune supporting nutrients.</h3>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "</div></div></div><!-- Row Backgrounds --><div class=\"upb_no_bg\" data-fadeout=\"\" data-fadeout-percentage=\"30\" data-parallax-content=\"\" data-parallax-content-sense=\"30\" data-row-effect-mobile-disable=\"true\" data-img-parallax-mobile-disable=\"true\" data-rtl=\"false\"  data-custom-vc-row=\"\"  data-vc=\"4.4.3\"  data-theme-support=\"\"    ></div><div class=\"wpb_row wpb_section wpb_parallax wpb_padding vc_row-fluid vc_custom_1427431750847\" data-speed=\"1\" style=\"height:400pxpx;\"><div class=\"container-fluid\"><div class=\"row\">\n" +
                "\t<div class=\"vc_col-sm-6 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<div style=\"min-height: 15px;\"></div>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<div style=\"max-width: 500px; float: right;\">\n" +
                "<h2 id=\"hopeblend\">Food-Sourced Vitamins and Minerals</h2>\n" +
                "<p>The fermentation of friendly single-cell plants has been used for <strong>centuries</strong> to preserve foods while enhancing their nutritional values.</p>\n" +
                "<p>Today, this fermentation process helps transform vitamins and minerals into highly complex foods where nutrients are bound together into a food matrix containing lipids, proteins, beta glucans, and a wide variety of beneficial phytonutrients &#8211; <b>fundamental building blocks for good nutrition.</b></p>\n" +
                "<p>This process provides the whole-food-sourced nutrients that best nourish our consumers as well as the <strong>world’s most vulnerable children</strong>.</p>\n" +
                "</div>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\n" +
                "\t<div class=\"vc_col-sm-6 wpb_column column_container vc_custom_1427666848622\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_single_image wpb_content_element vc_align_left\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t\t<div class=\"vc_single_image-wrapper   vc_box_border_grey\"><img width=\"960\" height=\"718\" src=\"http://hopebar.com/wp-content/uploads/2015/02/HopeBlend-1024x766.jpg\" class=\"vc_single_image-img attachment-large\" alt=\"HopeBlend\" /></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "</div></div></div><!-- Row Backgrounds --><div class=\"upb_no_bg\" data-fadeout=\"\" data-fadeout-percentage=\"30\" data-parallax-content=\"\" data-parallax-content-sense=\"30\" data-row-effect-mobile-disable=\"true\" data-img-parallax-mobile-disable=\"true\" data-rtl=\"false\"  data-custom-vc-row=\"\"  data-vc=\"4.4.3\"  data-theme-support=\"\"    ></div><div class=\"wpb_row wpb_section wpb_padding vc_row-fluid\"><div class=\"container\"><div class=\"row\">\n" +
                "\t<div class=\"vc_col-sm-6 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_single_image wpb_content_element vc_custom_1427431843621 vc_align_left\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t\t\t<div class=\"vc_single_image-wrapper   vc_box_border_grey\"><img width=\"823\" height=\"583\" src=\"http://hopebar.com/wp-content/uploads/2015/02/iStock_000020469526_Small.jpg\" class=\"vc_single_image-img attachment-large\" alt=\"Aloe vera plantation on Furteventura\" /></div>\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
                "\n" +
                "\t<div class=\"vc_col-sm-6 wpb_column column_container\">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t\n" +
                "\t<div class=\"wpb_text_column wpb_content_element \">\n" +
                "\t\t<div class=\"wpb_wrapper\">\n" +
                "\t\t\t<h2><b>Immunaloe</b></h2>\n" +
                "<p>WARNING: The following words sound complex, but the benefits of aloe are simple and its use can be traced as far back as ancient Egypt.</p>\n" +
                "<p class=\"p1\">Immunaloe is a proprietary Aloe-vera gel extract containing 5-10 times more of the bioavailable and immunomodulatory fractions of Acemannan than other aloe-vera extracts on the market.</p>\n" +
                "<p>Acemannans are the bioactive polysaccharides found in aloe vera gel that are responsible for its rich history as natures most health-promoting plant. Acemannans are polysaccharides comprised predominantly of the sugar mannose. Unlike other sugars in nature that are used by the body for energy production, Mannose is essential to every cell in the body for proper cell to cell communication including all functions of defense, repair, and regeneration.</p>\n" +
                "<p>The bioavailable fractions of Acemannan can be absorbed into the blood stream within minutes, providing mannose to our cells and organs. The immunomodulatory fractions help activate and modulate the activity of macrophages, the master regulating cells of our immune systems. Once the macrophages are activated, they can produce a variety of immune compounds needed to facilitate wound healing and the effective monitoring of viruses, infections, and disease processes.</p>\n" +
                "<p><strong>Combining Immunaloe with vitamins and minerals provides the most unique solution for fighting malnutrition</strong>.</p>\n" +
                "\n" +
                "\t\t</div> \n" +
                "\t</div> \n" +
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
                "\t\t\t\t<div class=\"col-md-4\"><section id=\"nav_menu-2\" class=\"widget widget_nav_menu\"><div class=\"menu-footer-container\"><ul id=\"menu-footer\" class=\"menu\"><li id=\"menu-item-494\" class=\"menu-item menu-item-type-post_type menu-item-object-page current-menu-item page_item page-item-26 current_page_item menu-item-494\"><a href=\"http://hopebar.com/hope-whole-food-bar/\">The Hope Bar</a></li>\n" +
                "<li id=\"menu-item-496\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-496\"><a href=\"http://hopebar.com/nourish-two/\">Buy One Nourish Two?</a></li>\n" +
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
        // webview.loadUrl("http://hopebar.com/the-hope-bar/");
    }
}
