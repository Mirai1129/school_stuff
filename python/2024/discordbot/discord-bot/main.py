import discord
import os
from dotenv import load_dotenv

load_dotenv()


class MyClient(discord.Client):
    async def on_ready(self):
        print(f'Logged on as {self.user}!')

    async def on_message(self, message):
        print(f'Message from {message.author}: {message.content}')


client = MyClient()

if __name__ == '__main__':
    client.run(os.getenv("TOKEN"))
