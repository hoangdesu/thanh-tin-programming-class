import io.javalin.Javalin;

public class Server {
    public static void main(String[] args) {
        Javalin server = Javalin.create();

        String[] menu = {"Com tam suon bi cha", "Pho bo tai"};

//        route handlers
        server.get("/", ctx -> ctx.result("goi cai gi?"));

        server.get("/com-tam", ctx -> ctx.result(menu[0]));

        server.get("/pho", ctx -> ctx.result(menu[1]));

        String firstName = "Tin";
        String lastName = "Do";

        server.get("/chef/name/firstname", ctx -> ctx.result(firstName));
        server.get("/chef/name/lastname", ctx -> ctx.result(lastName));
        server.get("/chef/name/fullname", ctx -> ctx.result(firstName + " " + lastName));

        String myWebsite = """
                <!DOCTYPE html>
                <html lang="en">
                  <head>
                    <meta charset="UTF-8" />
                    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                    <title>Hello HTML!</title>
                    
                    <style>
                        h1 {
                            color: red;
                        }
                    </style>
                  </head>
                                
                  <body>
                    <!-- Internal links -->
                    <a href="about.html">About me website</a>
                                
                    <!-- Headings -->
                    <!-- this is a comment in HTML, shortcut: cmd + / -->
                                
                    <!-- h1 - h6 -->
                    <h1>This is a H1</h1>
                    <h2>H2</h2>
                    <h3>H3</h3>
                    <h6>H6</h6>
                                
                    <!-- Paragraph -->
                    <p>This is a long paragraph</p>
                                
                    <!-- Image -->
                    <!-- attributes -->
                    <img
                      src="https://cdnmedia.baotintuc.vn/Upload/DmtgOUlHWBO5POIHzIwr1A/files/2024/03/22/Lamborghini-22032024-01.jpg"
                      alt="lamborghini is my favorite car"
                      width="400"
                    />
                    <img src="mclaren.jpg" alt="McLaren" width="400" />
                                
                    <!-- List -->
                    <!-- 1. ordered list -->
                    <!-- <li></li>: list item -->
                                
                    <h1>My favorite cars</h1>
                                
                    <!-- type="I": roman -->
                    <ol>
                      <li>Mercedes</li>
                      <li>McLaren</li>
                      <li>BMW</li>
                      <li>Audi</li>
                    </ol>
                                
                    <!-- 2. unordered list -->
                                
                    <h1>Favorite countries</h1>
                    <ul>
                      <li>Vietnam</li>
                      <li>Japan</li>
                      <li>France</li>
                    </ul>
                                
                    <!-- Link (anchor) element -->
                    <h3>External websites</h3>
                                
                    <a href="https://www.google.com">Click to go to google.com</a>
                    <br />
                                
                    <a href="https://www.youtube.com" target="_blank"
                      >Go to Youtube (IN A NEW TAB)</a
                    >
                    <br />
                                
                    <a
                      href="https://vnexpress.net/mercedes-amg-g63-ban-nang-cap-ve-viet-nam-gia-11-75-ty-dong-4545615.html"
                    >
                      <img
                        src="https://vcdn-vnexpress.vnecdn.net/2022/12/08/mercedes-amg-g63-vne-1-1670473-8565-9778-1670474526.jpg"
                        alt="G63"
                        width="200"
                      />
                    </a>
                                
                    <br />
                                
                    <h1>TABLE of my favorite food</h1>
                                
                    <table border="1">
                      <thead></thead>
                      <tbody>
                        <tr>
                          <th>No</th>
                          <th>Tên món ăn</th>
                          <th>Giá tiền</th>
                        </tr>
                                
                        <tr>
                          <td>1</td>
                          <td>Sushi chấm mắm tôm</td>
                          <td>269k</td>
                        </tr>
                                
                        <tr>
                          <td>2</td>
                          <td>Hột vịt lộn</td>
                          <td>30k</td>
                        </tr>
                                
                        <tr>
                          <td>3</td>
                          <td>Phở tái nạm gầu gân + trứng trần + 2 cái quẩy + 2 cục giò heo</td>
                          <td>120k</td>
                        </tr>
                      </tbody>
                      <tfoot></tfoot>
                    </table>
                    
                    <h1>Countries</h1>
                    <h3>Select your country:</h3>
                    <select name="" id="">
                        <option value="">Japan</option>
                        <option>Vietnam</option>
                        <option value="">Korea</option>
                    </select>
                                
                    <!-- Division:\s
                    - invisible -->
                                
                    <div style="margin-bottom: 500px"></div>
                  </body>
                </html>
                                
                """;

        server.get("/website", ctx -> ctx.html(myWebsite));

        server.start(7071);
    }
}
